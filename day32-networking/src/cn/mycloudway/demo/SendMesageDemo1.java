package cn.mycloudway.demo;

import java.io.IOException;
import java.net.*;

public class SendMesageDemo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String msg = "我来啦";
        byte[] bytes = msg.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
