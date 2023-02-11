package cn.mycloudway.test1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(2, "黑");
        Person p1 = new Person("老王", 30);
        p1.keepPet(d, "骨头");

        Cat c = new Cat(3, "灰");
        Person p2 = new Person("老李", 25);
        p2.keepPet(c, "鱼");
    }
}
