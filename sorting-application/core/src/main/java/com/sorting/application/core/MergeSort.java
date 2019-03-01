package com.sorting.application.core;

/*public class MergeSort implements SortingAlgorithm {
    public int[] sort(int[] arr) {
        return  executeSorting(arr, 0, arr.length - 1);

    }

    public int[] executeSorting(int[] inputArray, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex < rightMostIndex) {
            int middlePointIndex = (leftMostIndex + rightMostIndex) / 2;
            executeSorting(inputArray, leftMostIndex, middlePointIndex);
            executeSorting(inputArray, middlePointIndex + 1, rightMostIndex);
            return merge(inputArray, leftMostIndex, middlePointIndex, rightMostIndex);
        }
    }

    private int merge(int[] inputArray, int leftMostIndex, int middlePointIndex, int rightMostIndex) {
        int leftSubArraySize = middlePointIndex - leftMostIndex + 1;
        int rightSubArraySize = rightMostIndex - middlePointIndex;

        int[] leftSubArray = new int[leftSubArraySize];
        int[] rightSubArray = new int[rightSubArraySize];

        copyContent(inputArray, leftSubArray, leftMostIndex, leftSubArraySize);
        copyContent(inputArray, rightSubArray, middlePointIndex+1, rightSubArraySize);

        mergeArrays(inputArray, leftMostIndex, leftSubArraySize, rightSubArraySize, leftSubArray, rightSubArray);
     return }

    private void copyContent(int[] sourceArray, int[] targetArray, int fromIndex, int toIndex) {
        for (int index = 0; index < toIndex; index++) {
            targetArray[index] = sourceArray[fromIndex + index];
        }
    }

    private void mergeArrays(int[] inputArray, int leftMostIndex, int leftSubArraySize,
                             int rightSubArraySize, int[] leftSubArray, int[] rightSubArray) {
        int leftSubArrayIndex = 0;
        int rightSubArrayIndex = 0;

        int inputArrayIndex = leftMostIndex;
        while (leftSubArrayIndex < leftSubArraySize && rightSubArrayIndex < rightSubArraySize) {
            if (leftSubArray[leftSubArrayIndex] <= rightSubArray[rightSubArrayIndex]) {
                inputArray[inputArrayIndex] = leftSubArray[leftSubArrayIndex];
                leftSubArrayIndex++;
            } else {
                inputArray[inputArrayIndex] = rightSubArray[rightSubArrayIndex];
                rightSubArrayIndex++;
            }
            inputArrayIndex++;
        }

        copyToArrayIfExist(leftSubArray, inputArray, inputArrayIndex, leftSubArraySize, leftSubArrayIndex);
        copyToArrayIfExist(rightSubArray, inputArray, inputArrayIndex, rightSubArraySize, rightSubArrayIndex);
    }

    private void copyToArrayIfExist(int[] sourceArray, int[] targetArray, int fromIndex, int toIndex, int currentSourceArrayIndex) {
        while (currentSourceArrayIndex < toIndex) {
            targetArray[fromIndex] = sourceArray[currentSourceArrayIndex];
            currentSourceArrayIndex++;
            fromIndex++;
        }
    }
}*/
