package cn.mycloudway.test;

public class GeneralExercise6 {
    public static void main(String[] args) {
        int password = 1983;
        System.out.println("The encrypted password is " + passwordEncryption(password));
    }

    public static int passwordEncryption(int password) {
        /*
        StringBuilder new_password = new StringBuilder();

        while (password != 0) {
            int unit = password % 10;
            new_password.append((unit + 5) % 10);
            password /= 10;
        }

        return new_password.toString();
        */

        int copy = password;
        int count = 0;

        while (password != 0) {
            count++;
            password /= 10;
        }

        int[] arrPassword = new int[count];
        int index = 0;
        while (copy != 0) {
            int unit = copy % 10;
            arrPassword[index] = (unit + 5) % 10;
            index++;
            copy /= 10;
        }

        int result = 0;
        for (int j : arrPassword) {
            result = result * 10 + j;
        }

        return result;
    }
}
