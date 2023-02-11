package cn.mycloudway.test;

public class MoneyConvert {
    public static void main(String[] args) {
        int money = 21531;
        System.out.println(convert(money));
    }

    public static String convert(int money) {
        String[] chineseYuan = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] units = {"元", "拾", "佰", "仟", "万", "拾", "佰"};
        String result = "";

        int count = 0;
        while (true) {
            int unit = money % 10;
            result = chineseYuan[unit] + units[count] + result;
            money /= 10;
            if (money == 0) {
                break;
            } else {
                count++;
            }
        }

        if (count < 7) {
            for (int i = count + 1; i < 7; i++) {
                result = "零" + units[i] + result;
            }
        }

        return result;
    }
}
