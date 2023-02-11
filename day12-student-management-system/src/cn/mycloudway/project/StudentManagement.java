package cn.mycloudway.project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：忘记密码");
            System.out.println("4：退出");
            System.out.print("请选择要执行的操作：");

            String choice = scanner.next();
            if (choice.equals("4")) {
                break;
            }

            switch (choice) {
                case "1" -> login(userList);
                case "2" -> register(userList);
                case "3" -> forgetPassword(userList);
                default -> System.out.println("选项错误，请重新选择");
            }
        }
    }

    public static void enterSystem() {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.print("请输入您的选择：");
            String choice = scanner.next();
            if (choice.equals("5")) {
                break;
            }

            switch (choice) {
                case "1" -> addStudent(studentList);
                case "2" -> {
                    System.out.print("请输入学生ID：");
                    String id = scanner.next();
                    deleteStudent(studentList, id);
                }
                case "3" -> {
                    System.out.print("请输入学生ID：");
                    String id = scanner.next();
                    editStudent(studentList, id);
                }
                case "4" -> showStudent(studentList);
                default -> System.out.println("选项错误，请重新选择");
            }
        }
    }

    public static void addStudent(ArrayList<Student> studentList) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String id = "";

        while (flag) {
            System.out.print("请输入学生ID：");
            id = scanner.next();
            if (isStudentExisting(studentList, id)) {
                System.out.println("学生ID已存在，请重新输入：");
            } else {
                flag = false;
            }
        }
        System.out.print("请输入学生姓名：");
        String name = scanner.next();
        System.out.print("请输入学生年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入学生地址：");
        String address = scanner.next();

        studentList.add(new Student(id, name, age, address));
        System.out.println("学生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> studentList, String id) {
        if (isStudentExisting(studentList, id)) {
            studentList.remove(getStudentIndex(studentList, id));
            System.out.println("学生" + id + "已删除");
        } else {
            System.out.println("学生ID" + id + "不存在");
        }
    }

    public static void editStudent(ArrayList<Student> studentList, String id) {
        if (isStudentExisting(studentList, id)) {
            Student student = studentList.get(getStudentIndex(studentList, id));
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入学生姓名：");
            String name = scanner.next();
            System.out.print("请输入学生年龄：");
            int age = scanner.nextInt();
            System.out.print("请输入学生地址：");
            String address = scanner.next();

            student.setName(name);
            student.setAge(age);
            student.setAddress(address);

            System.out.println("学生" + id + "修改完成");
        } else {
            System.out.println("学生ID" + id + "不存在");
        }
    }

    public static void showStudent(ArrayList<Student> studentList) {
        if (studentList.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public static boolean isStudentExisting(ArrayList<Student> studentList, String id) {
        return getStudentIndex(studentList, id) >= 0;
    }

    public static int getStudentIndex(ArrayList<Student> studentList, String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public static void login(ArrayList<User> userList) {
        System.out.print("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        if (!isUserExisting(userList, username)) {
            System.out.println("用户名未注册，请先注册");
        } else {
            String verificationCode = getVerificationCode();
            System.out.print("请输入验证码" + verificationCode + "：");
            String inputCode = scanner.next();

            while (!inputCode.equalsIgnoreCase(verificationCode)) {
                System.out.print("验证码错误，请重新输入验证码" + verificationCode + "：");
                inputCode = scanner.next();
            }

            int count = 3;
            while (count > 0) {
                System.out.print("请输入密码：");
                String password = scanner.next();

                if (checkLogin(userList, username, password)) {
                    System.out.println("登录成功");
                    enterSystem();
                    break;
                } else {
                    count--;
                    System.out.println("用户名密码错误，请重新输入，还有" + count + "次机会");
                }
            }
        }
    }

    public static void register(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        String confirmPassword = "";
        String id = "";
        String phone = "";

        while (true) {
            System.out.print("请输入用户名：");
            username = scanner.next();

            if (verifyUsername(userList, username)) {
                break;
            }
        }

        while (true) {
            System.out.print("请输入密码：");
            password = scanner.next();
            System.out.print("请再次输入密码：");
            confirmPassword = scanner.next();

            if (verifyPassword(password, confirmPassword)) {
                break;
            }
        }

        while (true) {
            System.out.print("请输入身份证号码：");
            id = scanner.next();

            if (verifyID(id)) {
                break;
            }
        }

        while (true) {
            System.out.print("请输入手机号：");
            phone = scanner.next();

            if (verifyPhone(phone)) {
                break;
            }
        }

        User user = new User(username, password, id, phone);
        userList.add(user);
        System.out.println("用户注册成功");
    }

    public static void forgetPassword(ArrayList<User> userList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.next();

        if (!isUserExisting(userList, username)) {
            System.out.println("用户名未注册，请先注册");
        } else {
            User user = userList.get(getUserIndex(userList, username));

            System.out.print("请输入身份证号：");
            String id = scanner.next();
            System.out.print("请输入手机号：");
            String phone = scanner.next();

            if (user.getId().equals(id) && user.getPhone().equals(phone)) {
                String password = "";
                String confirmPassword = "";

                while (true) {
                    System.out.print("请输入密码：");
                    password = scanner.next();
                    System.out.print("请再次输入密码：");
                    confirmPassword = scanner.next();

                    if (verifyPassword(password, confirmPassword)) {
                        break;
                    }
                }

                user.setPassword(password);
                System.out.println("账号" + username + "信息修改成功");
            } else {
                System.out.println("账号信息不匹配，修改失败");
            }
        }
    }

    public static boolean isUserExisting(ArrayList<User> userList, String username) {
        return getUserIndex(userList, username) >= 0;
    }

    public static int getUserIndex(ArrayList<User> userList, String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }

    public static boolean checkLogin(ArrayList<User> userList, String username, String password) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username) && userList.get(i).getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public static boolean verifyUsername(ArrayList<User> userList, String username) {
        if (isUserExisting(userList, username)) {
            System.out.println("用户" + username + "已存在，请重新输入");
            return false;
        } else if (username.length() < 3 || username.length() > 15) {
            System.out.println("用户名长度必须在3-15位之间，请重新输入");
            return false;
        } else if (!isDigitsAndLetters(username)) {
            System.out.println("用户名应为字母和数字的组合，且不能为纯数字");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDigitsAndLetters(String str) {
        char[] chars = str.toCharArray();
        int countDigit = 0;
        int countLower = 0;
        int countUpper = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                countDigit++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                countLower++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countUpper++;
            }
        }

        if (countDigit == chars.length || (countDigit + countLower + countUpper) < chars.length) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isAllDigits(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= '0' && chars[i] <= '9')) {
                return false;
            }
        }

        return true;
    }

    public static boolean verifyPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            System.out.println("两次密码输入不同，请重新输入");
            return false;
        } else {
            return true;
        }
    }

    public static boolean verifyID(String id) {
        String start = id.substring(0, 17);
        char end = id.charAt(17);

        if (id.length() != 18) {
            System.out.println("身份证号长度必须为18位");
            return false;
        } else if (id.startsWith("0")) {
            System.out.println("身份证号不能以0开头");
            return false;
        } else if (!isAllDigits(start)) {
            System.out.println("身份证前17位必须是数字");
            return false;
        } else if (!(end >= '0' && end <= '9') && end != 'X' && end != 'x') {
            System.out.println("身份证最后一位必须为数字，X或者x");
            return false;
        } else {
            return true;
        }
    }

    public static boolean verifyPhone(String phone) {
        if (phone.length() != 11) {
            System.out.println("手机号长度必须为11位");
            return false;
        } else if (phone.startsWith("0")) {
            System.out.println("手机号不能以0开头");
            return false;
        } else if (!isAllDigits(phone)) {
            System.out.println("手机号应全部为数字");
            return false;
        } else {
            return true;
        }
    }

    public static String getVerificationCode() {
        ArrayList<Character> letterList = new ArrayList<>();
        ArrayList<Character> digitList = new ArrayList<>();
        Random random = new Random();
        char[] code = new char[5];

        for (char c = 'a'; c <= 'z'; c++) {
            letterList.add(c);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            letterList.add(c);
        }

        for (char c = '0'; c <= '9'; c++) {
            digitList.add(c);
        }

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(letterList.size());
            code[i] = letterList.get(index);
        }

        code[4] = digitList.get(random.nextInt(digitList.size()));

        for (int i = 0; i < code.length; i++) {
            int index = random.nextInt(code.length);
            char temp = code[i];
            code[i] = code[index];
            code[index] = temp;
        }

        return new String(code);
    }
}
