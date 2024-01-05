package com.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.next());
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("##");
//        while (scanner.hasNext()){
//            System.out.println("**");
//            System.out.println(scanner.next());
//        }
        File file = new File("props.txt");
        System.out.println(file.exists());
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

    }
}
