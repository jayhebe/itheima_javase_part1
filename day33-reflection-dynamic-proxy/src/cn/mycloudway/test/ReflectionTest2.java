package cn.mycloudway.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        properties.load(new FileReader("day33-reflection/prop.properties"));

        Class clazz = Class.forName(properties.get("classname").toString());

        Method method = clazz.getDeclaredMethod(properties.get("method").toString());
        method.setAccessible(true);

        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        method.invoke(constructor.newInstance());
    }
}
