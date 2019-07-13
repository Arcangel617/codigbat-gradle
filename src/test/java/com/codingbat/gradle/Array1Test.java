package com.codingbat.gradle;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Array1Test {

    private Array1 array1 = new Array1();

    @Test
    public void shouldReturnTrueIfFirstOrLastElementEquals6() {
        int[] nums = {1,2,6};
        boolean result = array1.firstLast6(nums);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfFirstOrLastElementIsNotEquals6() {
        int[] nums = {1,2,3};
        boolean result = array1.firstLast6(nums);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueIfFirstAndLastElementsAreEqual() {
        int[] nums = {1,2,1};
        boolean result = array1.sameFirstLast(nums);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfFirstAndLastElementsAreNotEqual() {
        int[] nums = {2,2,1};
        boolean result = array1.sameFirstLast(nums);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfArrayIsEmpty() {
        int[] nums = {};
        boolean result = array1.sameFirstLast(nums);
        assertFalse(result);
    }
}