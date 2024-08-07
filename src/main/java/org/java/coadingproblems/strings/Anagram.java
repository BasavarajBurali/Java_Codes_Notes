package org.java.coadingproblems.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        //converted to character
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        //sorted the array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = true;
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                anagram = false;
                break;
            }
        }
        if (anagram) {
            System.out.println("its anagaram");
        } else {
            System.out.println("its not anagaram");
        }
    }
}
