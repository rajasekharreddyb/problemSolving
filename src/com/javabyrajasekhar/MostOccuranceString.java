package com.javabyrajasekhar;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Given a list of website names, we want to find out the name which occurs most number of times in the list.
 * If multiple names occur the same number of times then the website which comes first in the alphabetical order wins.
 *
 * The first line of input will contains the number of websites names in the list (N, 1<N<=10),
 * and the following N lines will each contain the name of a website.
 *
 * For e.g. Given the following input:
 ** 3
 * Facebook
 * Google
 * Facebook
 *
 * The most common website is Facebook because it occurs 2 times in the list, and Google occurs only 1 time.
 *
 * The expected output format is:
 *
 * Facebook
 */
public class MostOccuranceString {
    public static void main(String[] args) {
        String names[]={"facebook","google","google","hpple","hpple"};
        getHigestOccurance(names);
    }

    private static void getHigestOccurance(String[] names) {
        Map<String,Integer> websites = new HashMap<>();
        for (String name:names){
            if (!websites.containsKey(name)) {
                websites.put(name,1);
            } else {
                websites.put(name,websites.get(name)+1);
            }
        }


       AtomicReference<String> website = new AtomicReference<>("");
        AtomicReference<Integer> count = new AtomicReference<>(0);
        Set<Map.Entry<String, Integer>> entries = websites.entrySet();
        entries.stream().forEach(e->{
            if (e.getValue() > count.get()) {
                count.set(e.getValue());
                website.set(e.getKey());
            } else if (e.getValue() == count.get()) {
                List<String> list = Arrays.asList(website.get(), e.getKey());
                Collections.sort(list);
                website.set(list.get(0));
            }
        });

        System.out.println(website.get());
        System.out.println(count.get());
    }
}
