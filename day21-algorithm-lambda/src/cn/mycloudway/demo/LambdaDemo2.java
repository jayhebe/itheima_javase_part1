package cn.mycloudway.demo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //必须是函数式接口的匿名内部类才能使用Lambda
        //函数式接口中只有一个方法，可以用@FunctionalInterface注解修饰
        method(() -> System.out.println("swimming"));
    }

    public static void method(Swim s) {
        s.swimming();
    }
}
