package cn.mycloudway.test;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 显示学生");
            System.out.println("4. 退出");
            System.out.print("请选择要执行的操作：");
            int choice = scanner.nextInt();
            boolean inner_flag = true;

            if (choice == 1) {
                while (inner_flag) {
                    System.out.print("请输入学生ID：");
                    String id = scanner.next();
                    if (isStudentExisting(students, id)) {
                        System.out.println("该学生ID已存在，请重新输入");
                    } else {
                        System.out.print("请输入学生姓名：");
                        String name = scanner.next();
                        System.out.print("请输入学生年龄：");
                        int age = scanner.nextInt();

                        int countNotNull = 0;
                        Student student = new Student(id, name, age);
                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null) {
                                students[i] = student;
                                break;
                            }
                            countNotNull++;
                        }

                        if (countNotNull == students.length) {
                            students[0] = students[1];
                            students[1] = students[2];
                            students[2] = student;
                        }

                        inner_flag = false;
                    }
                }

            } else if (choice == 2) {
                System.out.print("请输入学生ID：");
                String id = scanner.next();

                if (isStudentExisting(students, id)) {
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getId().equals(id)) {
                            students[i] = null;
                            System.out.println("学生" + id + "删除成功");
                        }
                    }
                } else {
                    System.out.println("学生" + id + "删除失败");
                }
            } else if (choice == 3) {
                for (int i = 0; i < students.length; i++) {
                    if (students[i] != null) {
                        System.out.println("学生学号：" + students[i].getId() + "，学生姓名：" + students[i].getName() + "，学生年龄：" + students[i].getAge());
                    }
                }
            } else {
                flag = false;
            }
        }
    }

    public static boolean isStudentExisting(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                return true;
            }
        }

        return false;
    }
}
