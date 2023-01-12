package cn.mycloudway.demo;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        System.out.println(list1);

        MyArrayList<Integer> list2 = new MyArrayList<>();

        list2.add(123);
        list2.add(456);
        list2.add(789);

        System.out.println(list2);
    }
}
