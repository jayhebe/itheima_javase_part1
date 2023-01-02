package cn.mycloudway.demo2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name);

        a.show();

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else {
            System.out.println("没有这个类型");
        }
    }
}
