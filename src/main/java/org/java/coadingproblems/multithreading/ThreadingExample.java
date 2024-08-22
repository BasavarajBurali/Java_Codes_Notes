package org.java.coadingproblems.multithreading;

class ThreadEx implements Runnable {
   public void run() {
       try{
           for (int i = 1; i < 100; i++) {
               System.out.println("printing the number :" + i);
           }
           Thread.sleep(5000000);
       }catch (Exception ex){
           System.out.println(ex);
       }


    }
}

public class ThreadingExample {
    public static void main(String[] args) {
        ThreadEx ex=new ThreadEx();

        Thread t1=new Thread(ex);
        t1.start();
    }


}


