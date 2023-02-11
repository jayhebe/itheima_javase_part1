package cn.mycloudway.demo4;

public class Test {
    public static void main(String[] args) {
        final Student S = new Student("Jay", 18);
        S.setName("Sherry");
        S.setAge(16);

        System.out.println(S.getName() + ", " + S.getAge());

        final int[] ARR = {1, 2, 3, 4, 5};
        ARR[0] = 10;
        ARR[1] = 20;

        for (int i = 0; i < ARR.length; i++) {
            System.out.print(ARR[i] + " ");
        }
    }
}
