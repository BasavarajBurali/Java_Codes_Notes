package compitativeprogramming;

public class AllOneToLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 2, 1, 2, 3, 1, 5, 22, 1};
        int[] array1 = new int[array.length];
        shiftOneTOleft(array, array1);
        for (int a : array1) {
            System.out.println(a);
        }

    }

    static int[] shiftOneTOleft(int[] array, int[] array1) {
        int k = 0;
        for (int value : array) {
            if (value == 1) {
                array1[k++] = value;

            }
        }
        for (int value : array) {
            if (value != 1) {
                array1[k++] = value;
            }
        }
        return array1;
    }
}
