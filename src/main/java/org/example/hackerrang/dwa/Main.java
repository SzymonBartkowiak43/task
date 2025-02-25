package org.example.hackerrang.dwa;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static boolean isAnagram(String a, String b) {
        String first = a.toLowerCase();
        String second = b.toLowerCase();

        Map<Character, Integer> map1 = new HashMap<>();
        for(char ch: first.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1 );
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for(char ch: second.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1 );
        }

        if(map1.equals(map2)) {
            return true;
        }
        return false;

    }
}
