package com.javabyrajasekhar;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int number = 100;
        int sum = calculateSumOfForZeroToGivenNumber(number);
        System.out.println(sum);
    }

    private static int calculateSumOfForZeroToGivenNumber(int number) {
      return  (number * (number + 1)/2);
    }
}
