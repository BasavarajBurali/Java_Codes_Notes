package multiThreading.bydurgeh;

class ThreadDemos extends Thread{
    public void run(){
        for (int i=100;i>0;i--){
            System.out.println("value of the thread is:"+" "+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
class TwoThreads extends Thread {
    public void  run(){
        for (int i=100;i<200;i++){
            System.out.println("My second thread is running:"+i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
public class DemoThreadClass {
    public static void main(String[] args) {
        ThreadDemos t1=new ThreadDemos();
        TwoThreads t2=new TwoThreads();
        ThreadDemo t3=new ThreadDemo();
       Thread thread=new Thread(t3);
        t1.start();
        t2.start();
        thread.start();

    }
}
