package cn.mycloudway.test;

public class Teacher {
    private String name;
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void teach() {
        System.out.println("teaching");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
