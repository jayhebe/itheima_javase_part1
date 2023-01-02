package cn.mycloudway.demo7;

public class PingPangCoaches extends Coaches implements SpeakForeignLanguage {
    public PingPangCoaches() {
    }

    public PingPangCoaches(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
