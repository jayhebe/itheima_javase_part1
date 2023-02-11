package cn.mycloudway.demo9;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }
}
