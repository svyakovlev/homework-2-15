package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static org.example.IntegerListImpl.*;

public class Main {
    public static void main(String[] args) {
        Integer[] integerList1 = new Integer[10_000];
        for (int i = 0; i < 10_000; i++) {
            integerList1[i] = (int) Math.random() * 10_000;
        }

        Integer[] integerList2 = Arrays.copyOf(integerList1,10000);
        Integer[] integerList3 = Arrays.copyOf(integerList1,10000);

        long startBubble = System.currentTimeMillis();
        sortBubble(integerList1);
        System.out.println(System.currentTimeMillis() - startBubble);

        long startInsertion = System.currentTimeMillis();
        sortInsertion(integerList2);
        System.out.println(System.currentTimeMillis() - startInsertion);

        long startSelection = System.currentTimeMillis();
        sortSelection(integerList3);
        System.out.println(System.currentTimeMillis() - startSelection);
    }
}