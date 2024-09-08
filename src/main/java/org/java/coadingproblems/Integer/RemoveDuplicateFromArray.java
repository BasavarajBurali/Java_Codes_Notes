package org.java.coadingproblems.Integer;

public class RemoveDuplicateFromArray {


    static  int[] duplicate(int[] array){
        int[] na=new int[array.length];
        int k=0;
        for (int i=0;i<array.length;i++){
            boolean duplicate=false;
            for (int j=0;j<k;j++){
                if (array[i]==na[j]){
                    duplicate=true;
                    break;

                }
            }
            if (!duplicate){
                na[k++]=array[i];
            }
        }
        return na;
    }

    static  int[] secondMethod(int[] a){
        int b[] =new int[a.length];//{1,1,2,2,2,3,3}
        int k=0;
        for (int i=0;i<a.length;i++){
            boolean found=false;
            for (int j=0;j<k;j++){
                if (a[i]==a[j]){
                    found=true;
                    break;
                }
            }
            if (!found){
                b[k]=a[i];
                k++;
            }
        }
        for (int y:b){
            System.out.println(y);
        }
        return  b;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2};
        int[] numbers=duplicate( array);
        for (int num:numbers){
            System.out.println(num);
        }
        int a[]={1,1,2,2,2,3,3};
        int[] unique=duplicate( array);
        for (int num:unique){
            System.out.println("Unique element: "+ num);
        }

    }
}
