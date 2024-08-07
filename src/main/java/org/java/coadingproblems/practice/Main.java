package org.java.coadingproblems.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] a = {10, 22, 12, 3, 0, 6};
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    leader = false;
                    break;

                }


            }
            if (leader) {
                ans.add(a[i]);
            }

        }

        for (int s : ans) {
            System.out.println(s);
        }

    }


}
