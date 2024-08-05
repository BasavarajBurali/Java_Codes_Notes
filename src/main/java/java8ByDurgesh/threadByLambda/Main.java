package java8ByDurgesh.threadByLambda;

public class Main {
    public static void main(String[] args)  {
        Runnable thread1=()->{
            System.out.println("thread is created");
            for (int i=0;i<10;i++){
                System.out.println("the values are "+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(thread1);
        t1.start();
    }
}
