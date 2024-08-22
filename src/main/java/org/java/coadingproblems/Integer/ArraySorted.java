package org.java.coadingproblems.Integer;

//Debug this again
class  ArraySorted{
//    static boolean isSorted(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[i])
//                    return false;
//            }
//        }
//
//        return true;
//    }

    public static void main(String args[]) {
//        int arr[] = {1,2,3,4,5}, n = 5;
//
//        System.out.println(isSorted(arr, n));

        int[ ] a={1,2,3,2,1,4};
        int[] b=new int[a.length-1];
        int k=0;
        for (int i=0;i<a.length;i++){
            boolean check=false;
            for (int j=0;j<i;j++){
                if (a[i]==a[j]){
                    check=true;
                    break;



                }
            }
            if (!check){
                b[k++]=a[i];
            }
        }

        for (int s:b){
            System.out.println(s);
        }


    }
}

