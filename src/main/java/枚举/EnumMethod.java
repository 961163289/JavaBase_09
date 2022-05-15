package 枚举;

/**
 * 演示 Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用 Season2枚举类,来演示各种方法
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字
        System.out.println(autumn.name());//AUTUMN

        //ordinal() 输出的是该枚举对象的次序/编号,从0开始编号
        //AUTUMN 枚举对象是第三个,因此输出2
        System.out.println(autumn.ordinal());//2

        //从反编译可以看出 values 方法,返回 Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("====遍历取出枚举对象(增强 for)====");
        for (Season2 season : values) {//增强for循环
            System.out.println(season);
        }

        //valueOf: 将字符串转换成枚举对象,要求字符串必须为已有的常量名,否则报异常
        //执行流程
        //1. 根据你输入的 "AUTUMN" 到 Season2 的枚举对象去查找
        //2. 如果找到了,就返回,如果没找到,就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn == autumn1);

        //compareTo: 比较两个枚举常量,比较的就是编号
        //老韩解读
        //1. 就是把 Season2.AUTUMN 枚举对象的编号和 Season2.SUMMER 枚举对象的编号比较
        //2. 看看结果
        /*
        public final int compareTo(E o) {=
            return self.ordinal - other.ordinal;
        }
        Season2.AUTUMN 的编号[2] - Season2.SUMMER 的编号[3]
        */
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));//-1 不等  0 相等

        //补充一个增强 for
        int[] nums = {1, 2, 9};
        //普通的for循环
        System.out.println("====普通的for====");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        //增强的for循环
        System.out.println("====增强的for====");
        //执行的流程是: 依次从 nums数组中取出数据,赋给i,如果取出完毕,则退出for
        for (int i : nums) {
            System.out.println(i);
        }

    }
}
