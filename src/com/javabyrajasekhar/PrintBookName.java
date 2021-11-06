package com.javabyrajasekhar;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 *We're looking to track some metrics for our e-book reading app. We have recent logs of usage for each user.
 *  Each log contains the book name, number of pages in the book, number of pages read for each book read by the user in that order.
 *  Can you help with some data analysis?
 *
 * Our code needs to return the following information: The name of the book with the highest percentage of book read by the user.
 * If a user watched 40 pages out of 60 pages for book1 (50 %) and 75 pages out of 226 pages of book2 (33%),
 * the book with the highest percentage read by the user is book1.
 *
 * The first line of the input is the number of logs in that input, N. Each of the following N lines area log.
 * And the output should be in this format:
 *
 * <book_name_with_highest_percentage_read>
 *
 * The expected output for the example provided in stdin is as shown below:
 *
 * The test book
 */

//book_name_with_highest_percentage_read
public class PrintBookName {
    public static void main(String[] args) {
        String array[] = {
            "The test book 100pages 90pages",
            "The test1 book1 100pages 60pages"};
        printBookNameWithHighestPercentage(array);
    }

    private static void printBookNameWithHighestPercentage(String[] array) {
        AtomicReference<String> bookname = new AtomicReference<>();
        AtomicReference<Double> percent = new AtomicReference<>(0.0);
        Arrays.stream(array).forEach(book ->{
         String[] bookTokens =   book.split(" ");
         String totalPagesRead = bookTokens[bookTokens.length-1];
         String totalPages = bookTokens[bookTokens.length-2];
         int totalPage = Integer.parseInt(totalPages.replace("pages",""));
         int totalPagesR = Integer.parseInt(totalPagesRead.replace("pages",""));

         //percentage formula
         double percentage = (totalPagesR % totalPage) ;

         if (percentage > percent.get()) {
             percent.set(percentage);
             bookname.set("" + bookTokens[0] + " " + bookTokens[1] + " " + bookTokens[2]);
         }
        });
        System.out.println(bookname);
        System.out.println(percent);
    }
}
