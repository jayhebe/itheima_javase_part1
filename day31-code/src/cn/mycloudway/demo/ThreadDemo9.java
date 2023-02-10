package cn.mycloudway.demo;

public class ThreadDemo9 {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.start();
        foodie.start();
    }
}
