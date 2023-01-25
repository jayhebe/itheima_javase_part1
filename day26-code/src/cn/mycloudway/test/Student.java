package cn.mycloudway.test;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String str) {
        this(str.split(",")[0], Integer.parseInt(str.split(",")[1]));
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String concat(Student s) {
        return s.getName() + "-" + s.getAge();
    }
}
