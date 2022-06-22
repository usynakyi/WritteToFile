package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\file.txt");
        PrintWriter pw = new PrintWriter(file);

        System.out.println("Input: putin huilo");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals("putin huilo")){
            System.out.println("Correct putin huilo!!!");
        }

        sc.close();

        pw.println(str);
        pw.close();
    }
}
