package cn.mycloudway.demo;

public class BlockSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {
                16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66
        };
        int number = 37;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = {b1, b2, b3};
        System.out.println(getIndex(blockArr, arr, number));
    }

    public static int getIndex(Block[] blockArr, int[] arr, int number) {
        int indexBlock = findIndexBlock(blockArr, number);

        if (indexBlock == -1) {
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }

        return -1;
    }
}
