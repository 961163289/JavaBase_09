package 枚举;

public class EnumExercise02 {
    public static void main(String[] args) {
        //获取所有的枚举对象,即数组
        Week[] weeks = Week.values();
        //遍历,使用增强 for
        System.out.println("====所有星期的信息如下====");
        for (Week w : weeks) {
            System.out.println(w);
        }
    }
}

enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");

    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
