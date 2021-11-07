package com.javabyrajasekhar;

public class Palindrome {
    public static void main(String[] args) {
      String name = "121";
      String reverse = reversename(name);
      checkGivenStringPalindromeOrNot(name,reverse);
    }

    private static void checkGivenStringPalindromeOrNot(String name, String reverse) {
        if (name.equals(reverse)) {
            System.out.println("given String is palindrome");
        } else {
            System.out.println("given String is not palindrome");
        }
    }

    private static String reversename(String name) {
        StringBuffer sb = new StringBuffer();

        for (int i=name.length()-1;i>=0;i--){
            sb.append(name.charAt(i));
        }

        return sb.toString();
    }
}
