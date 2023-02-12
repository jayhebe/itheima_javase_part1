package cn.mycloudway.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class ReflectionTest1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student s = new Student("小A", 23, '女', 167.5, "睡觉");
        Teacher t = new Teacher("波妞", 10000);

        saveObject(s);
        saveObject(t);
    }

    public static void saveObject(Object o) throws IllegalAccessException, IOException {
        Class clazz = o.getClass();
        BufferedWriter bw = new BufferedWriter(new FileWriter("day33-reflection/" + clazz.getSimpleName() + ".txt"));

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            bw.write(field.getName() + "=" + field.get(o));
            bw.newLine();
        }

        bw.close();
    }
}
