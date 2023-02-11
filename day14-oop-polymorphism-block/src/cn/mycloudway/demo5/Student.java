package cn.mycloudway.demo5;

public class Student {
    private String name;
    private int age;

    {
        System.out.println("开始创建对象了");
    }

    static {
        System.out.println("我就执行一次");
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("全参构造");
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
}
