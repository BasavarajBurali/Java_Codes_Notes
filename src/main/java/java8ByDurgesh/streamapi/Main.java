package java8ByDurgesh.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6,4,44,22);
//       List<Integer>l1= list.stream().filter(x->x%2==0).collect(Collectors.toList());
//        System.out.println(l1.toString());


//        List<String> name = Arrays.asList("aman", "ankit", "bawwa", "apeksha");
//        List<String> names = name.stream().filter(i -> i.startsWith("a")).collect(Collectors.toList());
//        System.out.println(names.toString());


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 44, 22);
        //       list.stream().map(i->i*i).forEach(System.out::println);
//        Integer num=list.stream().max((x,y)->x.compareTo(y)).get();
//        System.out.println(num);

       list.stream().filter(x->x%2==0).forEach(System.out::println);

    }
}
