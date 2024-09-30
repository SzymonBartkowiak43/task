package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        String[] split = String.valueOf(payment).split("\\.");
        String lastDigit = split[1].substring(0,2);
        String firstDigit = split[0];

        StringBuilder us = new StringBuilder();
        StringBuilder india = new StringBuilder();
        StringBuilder china = new StringBuilder();
        StringBuilder france = new StringBuilder();


        int counter = 0;

        for(int i = firstDigit.length()-1; i >= 0; i--) {
            counter++;
            if(counter == 3) {
                us.insert(0,"," + firstDigit.charAt(i));
                india.insert(0,"," + firstDigit.charAt(i));
                china.insert(0,"," + firstDigit.charAt(i));
                france.insert(0, " " + firstDigit.charAt(i));
                counter = 0;
            } else {
                us.insert(0, firstDigit.charAt(i));
                india.insert(0, firstDigit.charAt(i));
                china.insert(0, firstDigit.charAt(i));
                france.insert(0, firstDigit.charAt(i));
            }
        }


        us.append(".").append(lastDigit);
        us.insert(0,"$");

        india.append(".").append(lastDigit);
        india.insert(0,"Rs.");

        china.append(".").append(lastDigit);
        china.insert(0, "\u00A5");

        france.append(",").append(lastDigit).append(" \u20AC");






        System.out.println("US: " + us.toString());
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        scanner.close();
    }
}
