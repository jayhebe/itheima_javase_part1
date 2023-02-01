package cn.mycloudway.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ChangeData {
    public static void main(String[] args) throws IOException {
        //data.txt: 2-1-9-4-7-8
        FileReader fr = new FileReader("day28-code/data.txt");
        ArrayList<Integer> data = new ArrayList<>();

        int i;
        while ((i = fr.read()) != -1) {
            char c = (char) i;
            if (c != '-') {
                data.add(c - 48);
            }
        }

        data.sort((i1, i2) -> i1 - i2);

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < data.size(); j++) {
            if (j != data.size() - 1) {
                result.append(data.get(j)).append("-");
            } else {
                result.append(data.get(j));
            }
        }

        FileWriter fw = new FileWriter("day28-code/data.txt");
        fw.write(result.toString());

        fw.close();
        fr.close();
    }
}
