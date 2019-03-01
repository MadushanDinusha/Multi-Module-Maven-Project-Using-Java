package com.sorting.application.service;

public final class SortingUtilities {
    public static int[] convertStringArrayToIntArray(String[] args) {
        int n = args.length;
        int[] ints = new int[n];
        for(int i=0; i<ints.length;i++){
            ints[i] = Integer.parseInt(args[i]);
        }
        return ints;
    }

    public static void printIntArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
