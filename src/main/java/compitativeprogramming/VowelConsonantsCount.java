package compitativeprogramming;

import java.util.Arrays;

public class VowelConsonantsCount {
    public static void main(String[] args) {
        String str = "Chak De! India";
        String str1 = str.toLowerCase();
        char[] ch = str1.toCharArray();
        int vowelCount  = 0;
        int Consonant  = 0;

        System.out.println(Arrays.toString(ch));
        for (char c : ch) {
            boolean visited = false;
            if (c == 'a' || c == 'e' || c == 'e' || c == 'i' || c == 'u') {

                vowelCount ++;


            } else if (c != ' ' && c != '!') {
                Consonant ++;
            }
        }

        System.out.println("Total number of vowel:"+vowelCount   );
        System.out.println("Total number of Consonant:"+Consonant  );
    }
}
