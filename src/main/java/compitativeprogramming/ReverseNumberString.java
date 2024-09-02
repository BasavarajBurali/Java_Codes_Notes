package compitativeprogramming;

public class ReverseNumberString {
    public static void main(String[] args) {
        String str = "123";
        String str1 = "";
        int lastIndex = str.length() - 1;

        // Find the index of the last non-zero character
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '0') {
                lastIndex = i;
                break;
            }
        }

        // Reverse the string up to the last non-zero character
        for (int i = lastIndex; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
    }
}
