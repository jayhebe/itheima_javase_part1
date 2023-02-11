package cn.mycloudway.demo7;

public class Test {
    public static void main(String[] args) {
        PingPangAthletes pps = new PingPangAthletes("刘诗雯", 23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
