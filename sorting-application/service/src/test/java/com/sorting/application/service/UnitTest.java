package com.sorting.application.service;

import com.sorting.application.core.InsertionSort;
import com.sorting.application.core.SelectionSort;
import com.sorting.application.core.SortingAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {



        @Test

        public void test() {
            App arg = new App();
            List<? extends SortingAlgorithm> sortingAlgorithms = Arrays.asList(new InsertionSort(), new SelectionSort());
            for (SortingAlgorithm algorithm : sortingAlgorithms) {
                App appobj = new App();
                int[] input = {12, 4, 6, 2};
                int [] result= algorithm.sort(input);
                int exptarr[] ={2,4,6,12};
                assertArrayEquals(exptarr,result);
            }

        }
    }