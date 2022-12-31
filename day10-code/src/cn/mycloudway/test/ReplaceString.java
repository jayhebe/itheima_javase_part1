package cn.mycloudway.test;

public class ReplaceString {
    public static void main(String[] args) {
        String talk = "你玩的真好，以后不要再玩了，TMD";

//        String result = talk.replace("TMD", "***");
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
