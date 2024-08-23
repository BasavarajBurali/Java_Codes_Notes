package org.java.coadingproblems.strings;

public class ReverseHalfString {

        public static void main(String[] args) {
            String str = "string";

            String ns="";

            for (int i=0;i<str.length();i++){
                if (str.charAt(i)=='i'){
                    ns=reverse(ns);
                    continue;

                }

                ns=ns+str.charAt(i);


            }
            System.out.println(ns);

        }

        static String reverse(String ns){
            String rev="";
            for (int i=ns.length()-1;i>=0;i--){
                rev=rev+ns.charAt(i);
            }
            return rev;

        }
    }

