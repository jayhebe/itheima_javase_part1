package cn.mycloudway.test;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods good1 = new Goods("100", "pen", 18.8, 100);
        Goods good2 = new Goods("101", "pencil", 10.6, 200);
        Goods good3 = new Goods("102", "eraser", 6.8, 300);

        goods[0] = good1;
        goods[1] = good2;
        goods[2] = good3;

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + ", " + goods[i].getName() + ", " + goods[i].getPrice() + ", " + goods[i].getStock());
        }
    }
}
