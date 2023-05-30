package com.waltercrdz.coding.datastructures.codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    /**
     * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
     * Your goal is to find that missing element.
     * Write a function:
     * class Solution { public int solution(int[] A); }
     * that, given an array A, returns the value of the missing element.
     * For example, given array A such that:
     * A[0] = 2
     * A[1] = 3
     * A[2] = 1
     * A[3] = 5
     * the function should return 4, as it is the missing element.
     * Write an efficient algorithm for the following assumptions:
     * N is an integer within the range [0..100,000];
     * the elements of A are all distinct;
     * each element of array A is an integer within the range [1..(N + 1)].
     */
    public static int solution(int[] a) {
        final Set<Integer> prepro = new HashSet<>();
        for (int i = 0; i < a.length; i++)
            prepro.add(a[i]);

        for (int j = 1; j <= a.length + 1; j++)
            if (!prepro.contains(j))
                return j;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{}));
    }
}
