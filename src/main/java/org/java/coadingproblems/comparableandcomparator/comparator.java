package org.java.coadingproblems.comparableandcomparator;

import java.util.*;

class  Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age<o.age){
            return 1;
        }
        else {
            return -1;
        }
    };
}


public class comparator {
    public static void main(String[] args) {

//        Comparator<Integer> comp=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//           if (o1<o2){
//               return 1;
//           }else {
//               return -1;
//           }
//            }
//        };
        List<Student> student=new ArrayList<>();
        student.add(new Student(1,"ram"));
        student.add(new Student(4,"ram"));
        student.add(new Student(1,"sham"));
        student.add(new Student(8,"bham"));
       // Collections.sort(student,comp);
        Collections.sort(student);



    //    List<Integer> list= Arrays.asList(2,1,4,3,6,4,2);

//        Collections.sort(list,comp);
     System.out.println(student.toString());
    }
}
