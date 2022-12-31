package cn.mycloudway.test;

public class MaskPhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";
        System.out.println(mask(phoneNumber));
    }

    public static String mask(String phoneNumber) {
//        char[] chars = new char[phoneNumber.length()];
//        for (int i = 0; i < phoneNumber.length(); i++) {
//            if (i >= 3 && i <= 6) {
//                chars[i] = '*';
//            } else {
//                chars[i] = phoneNumber.charAt(i);
//            }
//        }
//
//        return new String(chars);
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
    }
}
