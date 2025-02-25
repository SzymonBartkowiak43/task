package org.example.hackerrang.jeden;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] parts = s.trim().split("[ !,?._'@]+");

        if(parts.length == 0) {
            System.out.println("0");
            return;
        }
        if(parts[0].isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(parts.length);
            Arrays.stream(parts).forEach(System.out::println);
        }


        scan.close();
    }
}
