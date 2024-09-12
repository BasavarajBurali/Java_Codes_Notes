package org.java.coadingproblems.Integer;

/*input-->array[] = {1, 2, 3, 4, 5};
 output-->  2 3 4 5 1
 */
public class RotateArrayByOne {

    static int[] leftRotate(int[] array) {
        int[] array1 = new int[array.length];
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            array1[k++] = array[i];

        }
        array1[k] = array[0];
        return array1;

    }

    static int[] rightRotate(int[] array) {
        int[] array2 = new int[array.length];

        // Rotate elements to the right by one position
        for (int i = 0; i < array.length - 1; i++) {
            array2[i + 1] = array[i];
        }

        // Set the last element of the new array to be the first element of the original array
        array2[0] = array[array.length - 1];

        return array2;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};

        int[] array1 = leftRotate(array);

        int[] array2 = rightRotate(array);


        System.out.println("the input is :1, 2, 3, 4, 5");
        System.out.print("the left rotation is: ");
        for (int num : array1) {

            System.out.print(num + " ");
        }


        System.out.println();
        System.out.print("the left rotation is: ");
        for (int num : array2) {

            System.out.print(num + " ");
        }

    }
}
