package org.java.coadingproblems.strings;

import java.util.Arrays;

/*Reversing the array and again reversing the the word
i/p=-> String str = "hey there hope you are having a good time.";
o/p=-> .emit doog a gnivah era uoy epoh ereht yeh
 */

public class ReverseTheWord {
    public static void main(String[] args) {
        String str = "hey there hope you are having a good time.";
        String revWord = "";
        String[] word = str.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            word[i]=reverseString(word[i]);

            revWord += word[i];
            if (i > 0) {
                revWord += " ";
            }

        }
        System.out.println(revWord.toString());


    }
    static String reverseString(String str){
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }return rev;

    }
}
