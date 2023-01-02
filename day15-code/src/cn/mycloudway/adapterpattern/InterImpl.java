package cn.mycloudway.adapterpattern;

public class InterImpl extends InterAdapter {
    @Override
    public void method3() {
        System.out.println("only rewrite method3");
    }
}
