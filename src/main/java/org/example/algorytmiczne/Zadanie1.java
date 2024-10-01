package org.example.algorytmiczne;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

//1) algorytm na stringu tzn na wejściu jest np: wwwegwwh a na wyjściu ma być 3w1e1g2w1h
public class Zadanie1 {
    public static void main(String[] args) {
        String word = "wwwegwwhh";
        System.out.println(transform1(word));
        System.out.println(transform2(word));
        System.out.println(transform3(word));
    }

    private static String transform1(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        char letter = string.charAt(0);
        StringBuilder returned = new StringBuilder();
        int howMany = 1;

        for(int i = 1; i < string.length(); i++) {
            if(string.charAt(i) == letter) {
                howMany++;
            } else {
                returned.append(howMany).append(letter);
                letter = string.charAt(i);
                howMany = 1;
            }
        }
        returned.append(howMany).append(letter);
        return returned.toString();
    }


    private  static String transform2(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        return IntStream.range(0,string.length())
                .mapToObj(string::charAt)
                .collect(Collectors.groupingBy(c -> c,Collectors.summingInt(c -> 1)))
                .entrySet()
                .stream()
                .map(e -> e.getValue() + String.valueOf(e.getKey()))
                .collect(Collectors.joining());
    }

    private static String transform3(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }

        char firstChar = string.charAt(0);
        int count = 1;


        while (count < string.length() && string.charAt(count) == firstChar) {
            count++;
        }

        return count + String.valueOf(firstChar) + transform3(string.substring(count));
    }
}
