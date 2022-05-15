package 枚举;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//OK
        Gender2 boy2 = Gender2.BOY;//OK

        System.out.println(boy.toString());//输出BOY
        //本质就是调用Gender2的父类
        /*
        public String toString() {
            return name;
        }
        */
        System.out.println(boy == boy2);//true

    }
}

enum Gender2 {
    BOY, GIRL;

//    @Override
//    public String toString() {
//        return "Gender2{}";
//    }
}
