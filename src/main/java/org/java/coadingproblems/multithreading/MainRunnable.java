package org.java.coadingproblems.multithreading;



class MultiThreadingDemos implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("printing the Thread"+Thread.currentThread().getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
public class MainRunnable {
    public static void main(String[] args) {
        MultiThreadingDemos obj=new MultiThreadingDemos();
        for (int i=0;i<5;i++){
            Thread t1=new Thread(obj);
            t1.start();

        }

    }
}
