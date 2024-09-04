package org.java.coadingproblems.strings;

public class MergeTwoStringAlternatively {
    public static void main(String[] args) {
        String str1="abc";
        String str2="pqr";
        int s1=str1.length();
        int s2=str2.length();
        char[] s4=new char[s1+s2];
        int i=0,j=0,k=0;
        while (i<s1&&j<s2){
            s4[k++]=str1.charAt(i);
            i++;
            s4[k++]=str2.charAt(j);
            j++;


        }
        while (i<s1){
            s4[k++]=str1.charAt(i++);
        }
        while (j<s2){
            s4[k++]=str1.charAt(j++);
        }
        //converting the chaqracter Array into string
        String result = new String(s4);


        System.out.println(result);
    }
}
