package com.homework11;

import com.homework11.sortingalgorithms.BubbleSort;
import com.homework11.sortingalgorithms.StandardCollectionSort;

import java.util.*;

public class Array {

    private static final ArrayList<Integer> arrayList = new ArrayList<>();
    private static final int NUMBER_OF_REPEAT = 10000;
    private static final int NUMBER_OF_ALGORITHMS = 2;


    public static void createArray() {
        for (int i = 0; i < NUMBER_OF_REPEAT; i++) {
            arrayList.add(i+1);
        }
    }

    public static void shuffleElements() {
        Collections.shuffle(arrayList);
    }

    public static void getTimeOfSort() {
        for (int i = 1; i <= NUMBER_OF_ALGORITHMS; i++) {
            shuffleElements();
            long startTime = new GregorianCalendar().getTimeInMillis();
            algorithmSelection(i);
            long finishTime = new GregorianCalendar().getTimeInMillis();
            System.out.println("Algorithm " + i + ":" + (finishTime - startTime) + "ms");
        }
    }

    public static void algorithmSelection(int algorithm) {

        switch (algorithm) {
            case 1 -> BubbleSort.sort(arrayList);
            default -> StandardCollectionSort.sort(arrayList);
        }
    }
}
