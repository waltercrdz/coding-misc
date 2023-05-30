package com.waltercrdz.coding.datastructures.algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++)
                if (intArray[i] > intArray[largest])
                    largest = i;
            ArrayUtil.swap(intArray, largest, lastUnsortedIndex);
        }

        ArrayUtil.printArray(intArray);
    }
}
