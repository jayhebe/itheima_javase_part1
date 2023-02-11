package cn.mycloudway.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class RestoreCSB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day29-code/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29-code/orderedCSB.txt"));
        ArrayList<String> content = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            content.add(line);
        }

        content.sort(Comparator.comparingInt(s -> Integer.parseInt(s.split("\\.")[0])));

        for (String s : content) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
