package cn.mycloudway.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ReflectionDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("cn.mycloudway.demo.Student");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        printDash();

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }

        printDash();

        System.out.println(clazz.getConstructor());
        System.out.println(clazz.getConstructor(String.class, int.class));
        System.out.println(clazz.getDeclaredConstructor(String.class));
        System.out.println(clazz.getDeclaredConstructor(int.class));

        printDash();

        Constructor cons1 = clazz.getConstructor(String.class, int.class);
        System.out.println(cons1.getModifiers());
        Parameter[] parameters = cons1.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        printDash();

        Constructor cons2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(cons2.getModifiers());
        cons2.setAccessible(true);
        Student s = (Student) cons2.newInstance("zhangsan");
        System.out.println(s);
    }

    public static void printDash() {
        System.out.println("----------------------------------------------");
    }
}
