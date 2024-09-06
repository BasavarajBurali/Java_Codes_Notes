package compitativeprogramming;

public class InfosysQuestion {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        System.out.println("Max value is :"+maxNumber(array));
        System.out.println("Min value is :"+minNumber(array));
        System.out.println("average numbere is :"+average(array));
        System.out.println("Count of element in the array is:"+ noOfElementinArray(array));


    }

    static  int maxNumber(int[] array){
        int n=array.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    static  int minNumber(int[] array){
        int n=array.length;
        int minValue=array[0];
        for (int i=0;i<n;i++){
            if (array[i]<minValue){
                minValue=array[i];
            }
        }
        return minValue;
    }

    static  double average(int[] array){
        int sum=0;
        for (int num:array){
            sum=sum+num;
        }
        return (double) sum/array.length;
    }

    static int noOfElementinArray(int[] array){
        int count=0;
        for (int num:array){
            count++;
        }
        return count;
    }

}
