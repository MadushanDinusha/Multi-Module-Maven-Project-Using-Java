package com.sorting.application.service;

import com.sorting.application.core.BubbleSort;
import com.sorting.application.core.InsertionSort;
import com.sorting.application.core.SelectionSort;
import com.sorting.application.core.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sorting.application.service.SortingUtilities.convertStringArrayToIntArray;
import static com.sorting.application.service.SortingUtilities.printIntArray;

public class SortingService {
    public static void main(String[] args ) {
        SortingService service = new SortingService();
        if (args.length > 0) {
            service.startSorting(args);
        } else {
            System.out.println("No input provided for sorting....!!!!");
        }
    }

    public List<int[]> startSorting(String[] args) {
        List<int[]> outputs = new ArrayList<>();
        List<? extends SortingAlgorithm> sortingAlgorithms = Arrays.asList(
                new InsertionSort(), new SelectionSort(), new BubbleSort());
        for (SortingAlgorithm algorithm: sortingAlgorithms) {
            int[] input = convertStringArrayToIntArray(args);
            int[] outputAfterSorting = algorithm.sort(input);
            outputs.add(outputAfterSorting);
            printIntArray(input);
        }
   return outputs; }
}
