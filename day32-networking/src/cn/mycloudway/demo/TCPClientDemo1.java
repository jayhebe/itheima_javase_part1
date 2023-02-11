package cn.mycloudway.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes(StandardCharsets.UTF_8));

        os.close();
        socket.close();
    }
}
