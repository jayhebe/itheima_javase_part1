package cn.mycloudway.demo;

public class ThisDemo {
    private int age;

    public void getAge() {
        //int age = 10;
        System.out.println(age);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo();
        demo.getAge();
    }
}
