package java8ByDurgesh.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String word="i am working on optional";
//        if (word==null){
//            System.out.println("its empty");
//        }else {
//            System.out.println(word.length());
//        }

          Optional<String> optional= Optional.ofNullable(word);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        System.out.println(optional.orElse("no value in the container"));
    }
}
