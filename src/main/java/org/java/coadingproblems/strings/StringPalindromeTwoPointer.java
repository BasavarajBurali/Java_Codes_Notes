package org.java.coadingproblems.strings;

public class StringPalindromeTwoPointer {
    public static void main(String[] args) {
        String s = "abba";
        int i = 0;
        int j = s.length() - 1;
        boolean palindrome = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (palindrome) {
            System.out.println("its palindrme");
        } else {
            System.out.println("its not palindrome");
        }
    }
}
