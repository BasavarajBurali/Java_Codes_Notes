package java8Feature;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,66,55,44,4334,33);
        list.stream().filter(x->x%2==0).sorted((x,y)->x.compareTo(y)).forEach(System.out::println);
    }
}
