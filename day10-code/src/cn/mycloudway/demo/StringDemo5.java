package cn.mycloudway.demo;

public class StringDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);
//        sb.reverse();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);
    }
}
