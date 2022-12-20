package cn.mycloudway.test;

public class GeneralExercise7 {
    public static void main(String[] args) {
        int encryptedPassword = 8346;
        System.out.println("The original password is " + decryptPassword(encryptedPassword));
    }

    public static int decryptPassword(int encryptedPassword) {
        int copy = encryptedPassword;
        
        int count = 0;
        while (encryptedPassword != 0) {
            count++;
            encryptedPassword /= 10;
        }
        
        int[] arrPassword = new int[count];
        int index = 0;
        while (copy != 0) {
            int unit = copy % 10;
            arrPassword[index] = unit;
            index++;
            copy /= 10;
        }

        for (int i = 0; i < arrPassword.length; i++) {
            if (arrPassword[i] >=5 && arrPassword[i] <= 9) {
                arrPassword[i] = arrPassword[i] - 5;
            } else if (arrPassword[i] >= 0 && arrPassword[i] <= 4) {
                arrPassword[i] = arrPassword[i] + 10 - 5;
            }
        }

        int result = 0;
        for (int j : arrPassword) {
            result = result * 10 + j;
        }

        return result;
    }
}
