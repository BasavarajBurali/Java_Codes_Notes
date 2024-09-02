package multiThreading.bydurgeh;


class ThreadDemo implements  Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("my thread is running from another class :"+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
       ThreadDemo t1=new ThreadDemo();
        Thread thread=new Thread(t1);
        thread.start();
    }
}
