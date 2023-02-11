package cn.mycloudway.demo9;

public class InnerTest {
    public static void main(String[] args) {
        Outer.Inter inter = new Outer().new Inter();
        inter.show();
    }
}
