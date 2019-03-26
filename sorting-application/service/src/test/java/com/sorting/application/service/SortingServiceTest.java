package com.sorting.application.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingServiceTest {

    @Test
    public void testSorting() {
        String[] input = new String[]{"1", "2", "50", "12"};
        SortingService sortingService = new SortingService();
        List<int[]> outputs = sortingService.startSorting(input);

        int[] requiredOutput = new int[]{1,2,12,50};

        for (int[] currentOutput: outputs) {
            assertArrayEquals(requiredOutput, currentOutput);
        }
    }
}