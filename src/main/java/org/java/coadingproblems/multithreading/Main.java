package org.java.coadingproblems.multithreading;


class  MultiThreadingDemo extends Thread{
    public void run() {
        try {
            System.out.println("Thread is running" + Thread.currentThread().getId());
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println("exception occurs");

        }

        }
}

public class Main {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            MultiThreadingDemo obj=new MultiThreadingDemo();
            obj.start();
        }


    }
}
