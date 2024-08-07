package org.java.coadingproblems.strings;

public class EvenLengthWordString {
    public static void main(String[] args) {
        String  s = "This is a toc java language";
        String[ ] word=s.split(" ");
        for (int i=0;i< word.length;i++){
            if (word[i].length()%2==0){
                System.out.println(word[i]);
            }

        }
    }
}
