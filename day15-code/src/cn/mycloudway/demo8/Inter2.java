package cn.mycloudway.demo8;

public interface Inter2 {
    public default void show() {
        System.out.println("Inter2接口中的默认方法show");
    }
}
