package com.javabyrajasekhar.sorting;

import java.util.Arrays;

/**
 * arr[] = 64 25 12 22 11
 *
 * // Find the minimum element in arr[0...4]
 * // and place it at beginning
 * 11 25 12 22 64
 *
 * // Find the minimum element in arr[1...4]
 * // and place it at beginning of arr[1...4]
 * 11 12 25 22 64
 *
 * // Find the minimum element in arr[2...4]
 * // and place it at beginning of arr[2...4]
 * 11 12 22 25 64
 *
 * // Find the minimum element in arr[3...4]
 * // and place it at beginning of arr[3...4]
 * 11 12 22 25 64
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        sortAssendingOrder(arr);
        sortDesendingOrder(arr);
    }

    private static void sortAssendingOrder(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int min =i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[min];
            arr[min]= temp;
        }
        Arrays.stream(arr).forEach(e->System.out.println(e));
    }

    private static void sortDesendingOrder(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int min =i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min] < arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[min];
            arr[min]= temp;
        }
        System.out.println("-------------------------------");
        Arrays.stream(arr).forEach(e->System.out.println(e));
    }
}
