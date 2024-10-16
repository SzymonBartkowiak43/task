package org.example.algorytmiczne;
/*
Napisz funkcję, która przyjmuje jako argument tablicę liczb całkowitych
i zwraca największą sumę nieprzylegających liczb.
Oznacza to, że nie możesz wybierać dwóch liczb, które znajdują się obok siebie w tablicy.

Przykład:

int[] nums = {2, 4, 6, 2, 5};
// Oczekiwany wynik: 13 (wybierz liczby 2, 6, 5)

int[] nums = {10, 4, 2, 10};
// Oczekiwany wynik: 20 (wybierz 10, 10

 */

import java.util.Arrays;

public class NumberSum {
    public int returnAnswer(int[] nums) {
        int length = nums.length;

        if(length == 0 ) {
            throw new RuntimeException();
        }
        if(length == 1 ){
            return nums[0];
        }

        int[] max = new int[length];
        max[0] = nums[0];

        max[1] = Math.max(nums[0], nums[1]);

        if(length == 2) {
            return max[1];
        }


        for(int i = 2; i < length; i++) {
            max[i] = Math.max(Math.max(max[i - 2] + nums[i], max[i - 1]), nums[i]);

        }
        return Arrays.stream(max).max().getAsInt();
    }
}
