package com.javabyrajasekhar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

//How do you remove duplicates from an array in place?
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int numbers [] = {3,4,2,1,3,6,7,3,2};
        //int numbers [] = {3,3,3,3,3,3,3,3};
        Map<Integer, Integer> integerIntegerMap = removeDuplicateswithmap(numbers);
        integerIntegerMap.forEach((K,v)-> System.out.println(K));
        System.out.println("---------------");
        int[] test = removeDuplicatesWithoutMap(numbers);
        Arrays.stream(test).forEach(e-> System.out.println(e));
    }

    //method1
    //without using map
    private static int[] removeDuplicatesWithoutMap(int[] numbers) {
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (numbers[i] == numbers[j]){
                    numbers[j] = 0;
                }
            }
        }
        return numbers;
    }

    //method2
    //with using map
    private static Map<Integer, Integer> removeDuplicateswithmap(int[] numbers) {
        Map<Integer,Integer> uniqueNumbers = new LinkedHashMap<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (!uniqueNumbers.containsKey(numbers[i])){
                    uniqueNumbers.put(numbers[i],0);
                }
            }
        }
        return uniqueNumbers;
    }
}
