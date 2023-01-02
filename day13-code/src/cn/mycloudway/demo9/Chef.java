package cn.mycloudway.demo9;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        super.work();
        System.out.println("炒菜");
    }
}
