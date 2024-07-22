package org.java.updated_version;

import java.util.Scanner;

public class SomeOfCube {
    public static void main(String[] args) {
        System.out.print("ENTER THE FIRST NUMBER: ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();

        System.out.print("ENTER THE SECOND NUMBER: ");
        Scanner sc2=new Scanner(System.in);
        int n=sc2.nextInt();

        int sumOfCube=0;

        if (m>n){
            System.out.println("m is grater than n");
        }else {
            for (int i=m;i<=n;i++){
                sumOfCube=sumOfCube+(i*i*i);

            }
        }
        System.out.println("the sum of the cube is: "+sumOfCube);
    }
}
