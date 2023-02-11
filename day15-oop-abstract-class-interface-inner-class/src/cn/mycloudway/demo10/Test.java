package cn.mycloudway.demo10;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写游泳方法");
            }
        };

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写吃方法");
            }
        };

        show(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("够吃骨头");
                    }
                }
        );
    }

    public static void show(Animal a) {
        a.eat();
    }
}
