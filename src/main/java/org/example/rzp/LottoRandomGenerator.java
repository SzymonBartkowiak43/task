package org.example.rzp;

import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoRandomGenerator {

    private static final int NUMBERS_TO_GENERATE = 6;
    private static final int NUMBER_ORIGIN = 1;
    private static final int NUMBER_BOUND = 50;

    public Set<Integer> getRandomSixNumbers() {
        SecureRandom random = new SecureRandom();
        return random.ints(NUMBERS_TO_GENERATE, NUMBER_ORIGIN, NUMBER_BOUND)
                .boxed()
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        LottoRandomGenerator generator = new LottoRandomGenerator();
        Set<Integer> randomNumbers = generator.getRandomSixNumbers();
        System.out.println("Wylosowane liczby: " + randomNumbers);
    }
}