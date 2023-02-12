package cn.mycloudway.demo;

public class ReflectionDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("cn.mycloudway.demo.Student");
        System.out.println(clazz1);

        Class clazz2 = Student.class;
        System.out.println(clazz2);

        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    }
}
