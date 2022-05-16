package 注解;

public class Override_ {
    public static void main(String[] args) {

    }
}

//父类
class Father {
    public void fly() {
        System.out.println("Father fly...");
    }

    public void say() {
    }
}

//子类
class Son extends Father {
    //老韩解读
    //1. @Override 注解放在 fly 方法上,表示子类的 fly 方法时重写了父类的 fly
    //2. 这里如果没有写 @Override 还是重写了父类 fly
    //3. 如果你写了@Override 注解，编译器就会去检查该方法是否真的重写了父类的
    //   方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误
    //4. 看看 @Override 的定义
    //   解读: 如果发现 @interface 表示一个 注解类
    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    }
    */
    @Override
    public void fly() {
        System.out.println("Son fly	");
    }

    @Override
    public void say() {
        super.say();
    }
}
