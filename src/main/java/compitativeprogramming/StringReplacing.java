package compitativeprogramming;
/*Question-->
input=apples replce a->p & p->a
output=paales
 */
public class StringReplacing {
    static String convert(String str,char ch1,char ch2){
        String ns="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                ns = ns + "p";
            } else if (str.charAt(i) == ch2) {
                ns = ns + "a";

            }else {
                ns=ns+str.charAt(i);
            }

        }
        return ns;
    }

    public static void main(String[] args) {
        String str="apples";
        char ch1='a';
        char ch2='p';
        String result=convert(str,ch1,ch2);
        System.out.println(result);
    }

}
