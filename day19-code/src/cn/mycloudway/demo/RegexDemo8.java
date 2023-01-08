package cn.mycloudway.demo;

public class RegexDemo8 {
    public static void main(String[] args) {
        String s = "美国队长asdfasdiofonio1234钢铁侠asdfihioasnio12345绿巨人";
        String pattern = "[\\w&&[^_]]+";
        String result = s.replaceAll(pattern, "vs");
        System.out.println(result);

        String[] names = s.split(pattern);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
