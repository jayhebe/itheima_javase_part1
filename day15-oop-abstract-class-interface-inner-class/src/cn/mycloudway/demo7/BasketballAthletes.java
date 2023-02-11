package cn.mycloudway.demo7;

public class BasketballAthletes extends Athletes {
    public BasketballAthletes() {
    }

    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
