package com.waltercrdz.coding.datastructures.algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        final int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
            for(int i = 0; i < lastUnsortedIndex; i++)
                if(intArray[i] > intArray[i + 1])
                    ArrayUtil.swap(intArray, i, i+1);

        ArrayUtil.printArray(intArray);
    }
}
