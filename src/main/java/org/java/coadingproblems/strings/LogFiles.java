package org.java.coadingproblems.strings;

import java.util.Arrays;

public class LogFiles {
    public static void main(String[] args) {
        String str=
                        "Error:Type1 Error In\n " +
                        "Error:Type1 Error in\n " +
                        "Info:Type1 Info\n" +
                        "Warn:Type1 Warn \n" +
                        "Error:Type2 Error \n";
     int   error = 0;
     int   type1_Εrror= 0;
     int   info = 0;
     int   warn = 0;
        String[] sentence=str.split("\n");
        System.out.println(Arrays.toString(sentence));
        for (String word:sentence){
            word=word.trim();
            System.out.println(word);
            if (word.startsWith("Error:Type1 ")){
                error++;
                type1_Εrror++;

            } else if (word.startsWith("Info:Type1 ")) {

                info++;

            }else if (word.startsWith("Warn:Type1 ")){
                warn++;

            }else if (word.startsWith("Error:Type2 ")){
                error++;
            }
        }
        System.out.println("error :"+error);
        System.out.println("type1_Εrror :"+type1_Εrror);
        System.out.println("info :"+info);
        System.out.println("warn :"+warn);
    }
}
