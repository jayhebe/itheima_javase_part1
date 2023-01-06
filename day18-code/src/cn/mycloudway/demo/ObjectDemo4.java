package cn.mycloudway.demo;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

        User u2 = (User) u1.clone();

        System.out.println(u1);
        System.out.println(u2);

        System.out.println("---------------------------------------");

        u1.getData()[0] = 100;
        System.out.println(u1);
        System.out.println(u2);

        System.out.println("---------------------------------------");

        User u3 = u1.deepClone();
        u1.setUsername("lisi");
        u1.getData()[1] = 200;
        System.out.println(u1);
        System.out.println(u3);
    }
}
