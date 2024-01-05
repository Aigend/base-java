package com.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("pangea.nioint.com");
//        System.out.println(inetAddress.isReachable(10));
        System.out.println(inetAddress.getHostAddress());
//        System.out.println(Arrays.);
    }
}
