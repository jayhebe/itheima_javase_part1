package cn.mycloudway.demo7;

public class BasketballCoaches extends Coaches {
    public BasketballCoaches() {
    }

    public BasketballCoaches(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
