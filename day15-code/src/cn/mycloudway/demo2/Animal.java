package cn.mycloudway.demo2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public Animal(String name, int age) {
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

    public void drink() {
        System.out.println("喝水");
    }

    public abstract void eat();
}
