package org.example.dailyTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*Given a list of numbers and a number k,
return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17,
 return true since 10 + 7 is 17.*/
class oneTest {

    @Test
    public void should_return_success() {
        //Given
        One one = new One();
        int[] tab = {10, 15, 3, 7};
        int k = 17;
        // When
        boolean b = one.checkIfPossible(tab, k);

        // Then
        Assertions.assertTrue(b);
    }

    @Test
    public void should_return_false() {
        //Given
        One one = new One();
        int[] tab = {10, 15, 3, 7};
        int k = 19;
        // When
        boolean b = one.checkIfPossible(tab, k);

        // Then
        Assertions.assertFalse(b);
    }

}