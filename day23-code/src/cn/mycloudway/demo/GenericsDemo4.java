package cn.mycloudway.demo;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Unknown> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        //method(list4); 不可以，不是Ye的子类
    }

    public static void method(ArrayList<? extends Ye> list) {

    }
}

class Ye {

}

class Fu extends Ye {

}

class Zi extends Fu {

}

class Unknown {

}