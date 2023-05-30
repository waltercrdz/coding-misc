package com.waltercrdz.coding.datastructures.algorithms;

public class ArrayUtil {

    public static void swap(int[] intArray, int i, int j) {
        if(i == j) return;
        final int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++)
            System.out.println(intArray[i]);
    }
}
