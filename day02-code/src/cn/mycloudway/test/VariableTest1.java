package cn.mycloudway.test;

public class VariableTest1 {
    public static void main(String[] args) {
        int passenger = 0;
        passenger += 1;
        passenger += 2;
        passenger -= 1;
        passenger += 2;
        passenger -= 1;
        passenger -= 1;
        passenger += 1;

        System.out.println(passenger);
    }
}
