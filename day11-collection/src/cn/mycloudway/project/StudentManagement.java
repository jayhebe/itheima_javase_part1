package cn.mycloudway.project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
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
}
