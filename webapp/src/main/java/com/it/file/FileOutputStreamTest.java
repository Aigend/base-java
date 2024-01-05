package com.it.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 读取文件字节数据到内存
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("/Users/wenlong.jin/code/java_code/code/ltcode/com/it/file/test.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        File copyFile = new File("copyTest.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
//        int b ;
//        while ((b = fileInputStream.read()) != -1){
////            System.out.println((char) b);
//            fileOutputStream.write(b);
//        }
//        fileOutputStream.close();
//        fileInputStream.close();

        File file = new File("file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(97);
        fileOutputStream.write('a');
        fileOutputStream.write('@');
        fileOutputStream.write('w');
        byte[] bs = "我们".getBytes("ascii");
        fileOutputStream.write(bs);
        byte[] arr = new byte[]{'s', 's', 'o', ' '};
        fileOutputStream.write(arr);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
