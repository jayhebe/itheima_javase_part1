package cn.mycloudway.demo;

public class StringOperation {
    public boolean stringFilter(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
