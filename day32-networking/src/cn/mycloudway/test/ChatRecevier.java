package cn.mycloudway.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatRecevier {
    public static void main(String[] args) throws IOException {
        boolean msgFlag = true;
        DatagramSocket ds = new DatagramSocket(10086);

        while (msgFlag) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();

            String msg = new String(data, 0, len);
            System.out.println("接收到信息：" + msg);
            if ("886".equals(msg)) {
                msgFlag = false;
            }
        }

        ds.close();
    }
}
