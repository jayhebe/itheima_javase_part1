package cn.mycloudway.demo9;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);

        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(carName);
            System.out.println(carColor);
        }
    }
}
