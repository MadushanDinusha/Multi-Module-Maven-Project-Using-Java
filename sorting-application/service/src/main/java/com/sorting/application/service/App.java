package com.sorting.application.service;

import com.sorting.application.core.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        List<? extends SortingAlgorithm> sortingAlgorithms = Arrays.asList(new InsertionSort(), new SelectionSort());
        for (SortingAlgorithm algorithm: sortingAlgorithms) {
            int[] input = getIntArr(args);
            MergeSort objmrg = new MergeSort();
            objmrg.sort(input,2,10);
            algorithm.sort(input);
            printArr(input);
        }

     //   List<Integer> integers = new ArrayList<>();

        SortingAlgorithm[] algos = new SortingAlgorithm[]{new InsertionSort()};
    }

    public static int[] getIntArr(String[] args) {


        int n = args.length;
        int[] ints = new int[n];
        for(int i=0; i<ints.length;i++){
            ints[i] = Integer.parseInt(args[i]);
        }
        return ints;
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
