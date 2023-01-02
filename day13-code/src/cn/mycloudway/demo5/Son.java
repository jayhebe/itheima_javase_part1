package cn.mycloudway.demo5;

public class Son extends Father {
    String name = "Son";

    public void sonShow() {
        String name = "Son show";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
