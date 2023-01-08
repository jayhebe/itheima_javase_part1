package cn.mycloudway.demo;

public class RegexDemo2 {
    public static void main(String[] args) {
        String mobileRegex = "1[3-9]\\d{9}";

        System.out.println("13112345678".matches(mobileRegex));
        System.out.println("13712345667".matches(mobileRegex));
        System.out.println("13945679027".matches(mobileRegex));
        System.out.println("139456790271".matches(mobileRegex));

        System.out.println("-----------------------------------------");

        String phoneRegex = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(phoneRegex));
        System.out.println("02122442".matches(phoneRegex));
        System.out.println("027-42424".matches(phoneRegex));
        System.out.println("0712-3242434".matches(phoneRegex));

        System.out.println("-----------------------------------------");

        String emailRegex = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(emailRegex));
        System.out.println("zhangsan@itcast.com".matches(emailRegex));
        System.out.println("dlei0009@163.com".matches(emailRegex));
        System.out.println("dlei0009@pci.com.cn".matches(emailRegex));
    }
}
