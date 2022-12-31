package cn.mycloudway.test;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();

        phoneList.add(new Phone("小米", 1000.0));
        phoneList.add(new Phone("苹果", 8000.0));
        phoneList.add(new Phone("锤子", 2999.0));

        System.out.println(getLowerPrice(phoneList, 3000));
    }

    public static ArrayList<Phone> getLowerPrice(ArrayList<Phone> phoneList, double price) {
        ArrayList<Phone> searchResult = new ArrayList<>();

        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getPrice() < price) {
                searchResult.add(phoneList.get(i));
            }
        }

        return searchResult;
    }
}
