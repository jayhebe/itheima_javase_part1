package cn.mycloudway.demo;

public class Student {
    private String name;
    private int age;
    public String gender;

    public Student() {
    }

    protected Student(int age) {
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
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

    public void sleep() {
        System.out.println("睡觉");
    }

    private String eat(String something) {
        System.out.println("吃" + something);
        return "good";
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
