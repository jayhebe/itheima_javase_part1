package cn.mycloudway.test1;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + d.getColor() + "颜色的狗");
            d.eat(something);
            d.lookHome();
        } else if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            System.out.println("年龄为" + this.age + "的" + this.name + "养了一只" + c.getColor() + "颜色的猫");
            c.eat(something);
            c.catchMouse();
        }
    }
}
