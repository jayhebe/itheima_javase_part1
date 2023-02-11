package cn.mycloudway.demo;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 18);

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
