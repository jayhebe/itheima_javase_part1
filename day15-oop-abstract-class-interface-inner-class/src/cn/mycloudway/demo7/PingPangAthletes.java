package cn.mycloudway.demo7;

public class PingPangAthletes extends Athletes implements SpeakForeignLanguage {
    public PingPangAthletes() {
    }

    public PingPangAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
