package com.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeTest {
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();

        System.out.println("处理器数量：" + rt.availableProcessors());
        System.out.println("空闲内存数：" + rt.freeMemory());
        System.out.println("总内存数：" + rt.totalMemory());
        System.out.println("可用的最大内存数：" + rt.maxMemory());

        try{
            //单独起进程运行系统命令
            Process p = rt.exec("pwd");
            //这里要注意流的方向
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line); // /Users/wenlong.jin/code/java_code/webapp
            }
            //等待命令执行完成
            p.waitFor();
            //关闭流
            bufferedReader.close();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }

    }
}
