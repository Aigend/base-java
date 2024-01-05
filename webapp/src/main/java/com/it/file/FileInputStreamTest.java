package com.it.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 输入字节到文件
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/wenlong.jin/code/java_code/code/ltcode/com/it/file/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
//        int b ;
//        while ((b = fileInputStream.read()) != -1){
////            System.out.println((char) b);
//        }


//        byte[] arr = new byte[30];
//        int len1;
//        while ((len1 = fileInputStream.read(arr))!=-1){
//            String s= new String(arr);
//            System.out.println(s);
//        }

//        byte[] arr = fileInputStream.readAllBytes();
//        String s = new String(arr);
//        System.out.println(s);



        fileInputStream.close();

    }
}
