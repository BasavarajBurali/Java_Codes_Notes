package org.java.coadingproblems.strings;

public class OccuranceOfCharacterForLoop {
    public static void main(String[] args) {
        String s = "hi hell how are you";
        char[] c = s.toCharArray();

        // To avoid duplicate printing, use a boolean array to mark counted characters
        boolean[] counted = new boolean[c.length];

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ' || counted[i]) {
                continue; // Skip spaces and already counted characters
            }
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    counted[j] = true; // Mark this character as counted
                }
            }
            System.out.println(c[i] + " " + count);
        }
    }
}
