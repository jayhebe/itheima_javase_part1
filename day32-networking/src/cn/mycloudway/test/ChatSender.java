package cn.mycloudway.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender {
    public static void main(String[] args) throws IOException {
        boolean msgFlag = true;
        Scanner scanner = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramSocket ds = new DatagramSocket();

        while (msgFlag) {
            System.out.print("请输入要发送的信息：");
            String msg = scanner.nextLine().strip();
            byte[] bytes = msg.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            ds.send(dp);

            if ("886".equals(msg)) {
                msgFlag = false;
            }
        }

        ds.close();
    }
}
