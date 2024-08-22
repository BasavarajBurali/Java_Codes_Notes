package org.java.coadingproblems.designpattern;
class SingletoneExample {
    public static  SingletoneExample singletoneInstance;

    private SingletoneExample(){

    }

    public static SingletoneExample getInstance(){
        if (singletoneInstance==null){
            singletoneInstance=new SingletoneExample();
        }
        return singletoneInstance;
    }

    public void message(){
        System.out.println("obj is created");
    }
}

public class Main{
    public static void main(String[] args) {
        SingletoneExample s=SingletoneExample.getInstance();
        s.message();

        SingletoneExample y=SingletoneExample.getInstance();
        y.message();

    }
}
