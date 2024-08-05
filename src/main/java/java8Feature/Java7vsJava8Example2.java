package java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7vsJava8Example2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("sam","mohan","sam");

        List<String> uniqueList=new ArrayList<>();
        for (String name:names){
            if (!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }
        System.out.println(uniqueList.toString());


        //java8

       List <String> name1=names.stream().distinct().collect(Collectors.toList());
    }
}
