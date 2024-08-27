package java8Feature.streamapi;

import java.util.Arrays;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,1,3,2,5,4,7,6);
        list.stream().sorted().map(x->x*x).sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
    }
}
