package cn.mycloudway.demo7;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();

        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
    }
}
