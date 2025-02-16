package org.example.dailyTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Given a list of numbers and a number k,
return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17,
 return true since 10 + 7 is 17.*/
public class One {

    boolean checkIfPossible(int[] tab, int k) {
        Set<Integer> seen = new HashSet<>();

        for(int number: tab) {
            int check = k - number;

            if(seen.contains(check)) {
                return true;
            }
            seen.add(number);
        }

        return false;
    }
}
