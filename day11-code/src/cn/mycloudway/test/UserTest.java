package cn.mycloudway.test;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("001", "user1", "123456"));
        userList.add(new User("002", "user2", "123456"));
        userList.add(new User("003", "user3", "123456"));

        System.out.println(findUser(userList, "001"));
    }

    public static boolean findUser(ArrayList<User> userList, String id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)) {
                return true;
            }
        }

        return false;
    }
}
