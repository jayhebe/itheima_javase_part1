package cn.mycloudway.demo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("day29-code/a.zip"), new File("day29-code/b.zip"));

        //将aaa文件夹里面的内容拷贝到bbb文件夹下
        FileUtils.copyDirectory(new File("aaa"), new File("bbb"));
        //将aaa文件夹整体拷贝到bbb文件夹下
        FileUtils.copyDirectoryToDirectory(new File("aaa"), new File("bbb"));

        FileUtils.deleteDirectory(new File("aaa"));
        FileUtils.cleanDirectory(new File("bbb"));
    }
}
