package cn.mycloudway.demo;

import java.lang.reflect.Field;

public class ReflectionDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("cn.mycloudway.demo.Student");

        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        printDash();

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        printDash();

        Field gender = clazz.getField("gender");
        System.out.println(gender);

        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

        int modifier = name.getModifiers();
        System.out.println(modifier);

        String n = name.getName();
        System.out.println(n);

        Class<?> type = name.getType();
        System.out.println(type);
        Student s = new Student("zhangsan", 23);
        name.setAccessible(true);
        System.out.println(name.get(s));
        name.set(s, "lisi");
        System.out.println(name.get(s));
    }

    public static void printDash() {
        System.out.println("----------------------------------------------");
    }
}
