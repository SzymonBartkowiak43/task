package org.example.algorytmiczne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSumTest {

    private NumberSum numberSum;
    @BeforeEach
    public void init() {
        numberSum = new NumberSum();
    }

    @Test
    public void normalArray() {
        //given
        int[] nums = {2, 4, 6, 2, 5};

        //when
        int answer = numberSum.returnAnswer(nums);

        //then
        assertEquals(13, answer);
    }

    @Test
    public void nextArray() {
        //given
        int[] nums = {10, 4, 2, 10};

        //when
        int answer = numberSum.returnAnswer(nums);

        //then
        assertEquals(20, answer);
    }

    @Test
    public void arrayWithNegativeNumbers() {
        int[] nums = {-10, -4, 2, 10, 1, 1};

        //when
        int answer = numberSum.returnAnswer(nums);

        //then
        assertEquals(11, answer);
    }

    @Test
    public void emptyArray() {
        int[] nums = {};


        //when && then
        assertThrows(RuntimeException.class, () -> numberSum.returnAnswer(nums));
    }

    //testy od gpt zobavzymy czy jakis nie przejdzie
    @Test
    public void emptyArray_shouldThrowException() {
        // given
        int[] nums = {};

        // when & then
        assertThrows(RuntimeException.class, () -> numberSum.returnAnswer(nums));
    }

    @Test
    public void singleElementArray_shouldReturnThatElement() {
        // given
        int[] nums = {10};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(10, result);
    }

    @Test
    public void twoElementArray_shouldReturnMaxElement() {
        // given
        int[] nums = {10, 4};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(10, result);
    }

    @Test
    public void exampleArray_shouldReturnExpectedSum() {
        // given
        int[] nums = {2, 4, 6, 2, 5};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(13, result); // 2 + 6 + 5
    }

    @Test
    public void exampleArrayWithEqualElements_shouldReturnExpectedSum() {
        // given
        int[] nums = {10, 4, 2, 10};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(20, result); // 10 + 10
    }

    @Test
    public void negativeNumbersArray_shouldReturnExpectedSum() {
        // given
        int[] nums = {-1, -3, -4, -2};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(-1, result); // -1 is the highest sum
    }

    @Test
    public void mixedPositiveAndNegativeNumbers_shouldReturnExpectedSum() {
        // given
        int[] nums = {3, 2, 5, 10, 7};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(15, result); // 3 + 10 + 2
    }

    @Test
    public void alternatingHighLow_shouldReturnExpectedSum() {
        // given
        int[] nums = {1, 100, 1, 100, 1};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(200, result); // 100 + 100
    }

    @Test
    public void twoAdjacentNumbers_shouldReturnMaxSum() {
        // given
        int[] nums = {1, 2};

        // when
        int result = numberSum.returnAnswer(nums);

        // then
        assertEquals(2, result); // the maximum is 2
    }

}