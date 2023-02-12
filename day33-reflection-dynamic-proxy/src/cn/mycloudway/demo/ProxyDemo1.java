package cn.mycloudway.demo;

public class ProxyDemo1 {
    public static void main(String[] args) {
        Star proxy = ProxyUtil.createProxy(new SuperStar("鸡哥"));
        System.out.println(proxy.sing("鸡你太美"));
        proxy.dance();
    }
}
