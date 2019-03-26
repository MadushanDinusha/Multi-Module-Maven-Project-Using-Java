package com.sorting.application.core;

public class InsertionSort implements SortingAlgorithm {
    public int[] sort(int[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;
        System.out.print("Using Insertion Sort :");
        for(int i=0;i<n;i++){
            int j=i-1;
            int flag = arr[i];
            while(j>=0 && arr[j]>flag){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=flag;
        }

        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns For Insertion Sort");
        return arr;
    }
}
