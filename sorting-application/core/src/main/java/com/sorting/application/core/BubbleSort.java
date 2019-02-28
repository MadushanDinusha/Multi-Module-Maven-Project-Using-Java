package com.sorting.application.core;

public class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] arr) {
        int n = arr.length;
        System.out.print("Using Bubble Sort :");
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns for Bubble sort");
        return arr;
    }

}
