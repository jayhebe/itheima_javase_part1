package cn.mycloudway.demo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {

    }

    public static Student getOldestStudent(ArrayList<Student> studentList) {
        int max = 0;
        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(max).getAge() < studentList.get(i).getAge()) {
                max = i;
            }
        }

        return studentList.get(max);
    }
}
