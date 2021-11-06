package com.javabyrajasekhar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Here we need to find the max occurance of a number from the given array.
 *
 * ex1:{1,2,3,45,1,2,3,1,2,2}
 * number 2 4 times
 *
 * condition:- if two numbers having same no of occurance then consider first occurance number.
 * ex2:{1,2,3,45,1,2,3,1,2,2,1}
 * number 1 4 times
 */
public class MaxOccuranceNumberFromArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,1,2,3,1,2,2};
        Map<Integer,Integer> map =new LinkedHashMap<>();
        for (int num:arr) {
            if(map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        AtomicInteger key= new AtomicInteger();
        AtomicInteger value= new AtomicInteger();
        entries.stream().forEach(e ->{
            if(e.getValue() > value.get()){
                key.set(e.getKey());
                value.set(e.getValue());
            }

        });
        System.out.println("key "+key.get()+" value "+value.get());
    }
}
