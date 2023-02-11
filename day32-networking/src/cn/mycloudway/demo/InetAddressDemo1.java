package cn.mycloudway.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("localhost");
        System.out.println(address.toString());

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
