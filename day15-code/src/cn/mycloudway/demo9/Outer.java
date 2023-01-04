package cn.mycloudway.demo9;

public class Outer {
    private int a = 30;
    class Inter {
        private int a = 20;

        public void show() {
            int a = 10;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }
    }

    public Inter getInstance() {
        return new Inter();
    }
}
