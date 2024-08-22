package org.java.coadingproblems.strings;

public class RemoveTrailingZeros {
    public static void main(String[] args) {
        String str="22012300";
        String nw="";
        for (int i=str.length()-1;i>=0;i--){
            if (str.charAt(i)!='0'){
               nw= str.substring(0,i+1);

            }
        }
        System.out.println(nw);
    }
}
