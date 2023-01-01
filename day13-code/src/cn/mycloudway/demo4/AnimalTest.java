package cn.mycloudway.demo4;

public class AnimalTest {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.grabMouse();

        Huskie h = new Huskie();
        h.eat();
        h.drink();
        h.housekeeping();
        h.pullDown();
    }
}
