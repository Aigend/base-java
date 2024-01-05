package com.it.file;

import java.io.IOException;
import java.io.InputStream;

public class SystemInTest {
    public static void main(String[] args) throws IOException {
        System.out.println(System.in instanceof InputStream);
        InputStream inputStream = System.in;
        inputStream.read();
    }
}
