package cn.mycloudway.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastDemo1 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();

        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10086;
        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ms.send(dp);
        ms.close();
    }
}
