package java8ByDurgesh.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SS {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,23000,"ram"));
        list.add(new Employee(2,25000,"mak"));
        list.add(new Employee(3,13000,"ramesh"));
        list.stream().max(Comparator.comparingInt(e->e.salary));


    }
}


class  Employee{
    int id;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    int salary;
}