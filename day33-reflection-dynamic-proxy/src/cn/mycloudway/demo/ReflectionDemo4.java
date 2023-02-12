package cn.mycloudway.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("cn.mycloudway.demo.Student");

//        Method[] methods = clazz.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }
//
//        printDash();

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        printDash();

        Method method = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(method);
        System.out.println(method.getModifiers());
        System.out.println(method.getName());
        Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        printDash();

        Student s = new Student();
        method.setAccessible(true);
        Object value = method.invoke(s, "fish");
        System.out.println(value);
    }

    public static void printDash() {
        System.out.println("----------------------------------------------");
    }
}
