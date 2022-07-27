package com.homework11.sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public static void sort(ArrayList<Integer> arrayToSort) {

        for (int i = arrayToSort.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arrayToSort.get(j) > arrayToSort.get(j + 1)) {
                    Collections.swap(arrayToSort, j, j + 1);
                }
            }
        }
    }
}
