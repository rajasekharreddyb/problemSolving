package com.javabyrajasekhar.sorting;

import java.util.Arrays;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * Example:
 * First Pass:
 * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
 * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
 * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
 * Second Pass:
 * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
 * ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
 * Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
 * Third Pass:
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        sortAssendingOrder(arr);
        sortDesendingOrder(arr);
    }

    private static void sortAssendingOrder(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(e->System.out.println(e));
    }

    private static void sortDesendingOrder(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("-----------------------");
        Arrays.stream(arr).forEach(e->System.out.println(e));
    }
}
