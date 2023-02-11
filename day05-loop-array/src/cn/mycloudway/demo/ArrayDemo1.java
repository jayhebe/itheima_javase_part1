package cn.mycloudway.demo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //int[] ageOfStudent = new int[]{13, 14, 13, 15, 12};
        int[] ageOfStudent = {13, 14, 13, 15, 12};
        System.out.println(ageOfStudent);

        //String[] nameOfStudent = new String[]{"Jay", "Sherry", "Kitty"};
        String[] nameOfStudent = {"Jay", "Sherry", "Kitty"};
        System.out.println(nameOfStudent);

        //double[] heightOfStudent = new double[]{1.85, 1.8, 1.76};
        double[] heightOfStudent = {1.85, 1.8, 1.76};
        System.out.println(heightOfStudent);

        for (String name : nameOfStudent) {
            System.out.println(name);
        }

        for (int i = 0; i < nameOfStudent.length; i++) {
            System.out.println(nameOfStudent[i]);
        }
    }
}
