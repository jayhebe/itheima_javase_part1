package cn.mycloudway.test;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("Data invalid.");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void sleep() {
        System.out.println("sleeping");
    }

    public void eat() {
        System.out.println("eating");
    }
}
