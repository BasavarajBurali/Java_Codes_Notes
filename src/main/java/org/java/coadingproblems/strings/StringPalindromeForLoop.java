package org.java.coadingproblems.strings;

public class StringPalindromeForLoop {
    public static void main(String[] args) {
        String s="abba";
        String check=s;
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if (rev.equals(check)){
            System.out.println("its palindrome");
        }else {
            System.out.println("its not palindrome");
        }
    }
}
