package java8ByDurgesh.methodrefrence;

public class MethodRefrenceDemo {
    public static void main(String[] args) {
        MyInterface myInterface = Stuf::doTask;
        myInterface.task();
    }
}
