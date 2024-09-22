package compitativeprogramming;

public class StringFirstLetterOfString {
    public static void main(String[] args) {
        String str="my self basavaraj";
        String[] words=str.split(" ");
        for (String word:words){
            System.out.println(word.charAt(0));
        }
    }
}
