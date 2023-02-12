package cn.mycloudway.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(SuperStar superStar) {
        Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("sing".equals(method.getName())) {
                    System.out.println("准备话筒，收钱");
                } else if ("dance".equals(method.getName())) {
                    System.out.println("准备场地，收钱");
                }

                return method.invoke(superStar, args);
            }
        });
        return star;
    }
}
