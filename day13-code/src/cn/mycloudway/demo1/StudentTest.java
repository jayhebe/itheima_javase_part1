package cn.mycloudway.demo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(23);
        s1.setGender("男");

        Student.teacherName = "阿老师";

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(24);
        s2.setGender("男");

        s2.study();
        s2.show();
    }
}
