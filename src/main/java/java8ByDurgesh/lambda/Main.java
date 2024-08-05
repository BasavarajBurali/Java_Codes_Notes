package java8ByDurgesh.lambda;

public class Main {
    public static void main(String[] args) {

//     MyInterface   i=new MyInterface(){
//
//            @Override
//            public void myMethod() {
//                System.out.println("it my anonymoues class");
//            }
//        };
//     i.myMethod();

//       MyInterface i= ()->System.out.println("this is first time i am using lambda");
//       i.myMethod();


          //second interface
//        SumNumber num=(a,b)->{return (a+b);};
//        System.out.println( num.sumNumber(2,3));


         //third Interface
     StrLength strLength=str ->  str.length();
        System.out.println(strLength.getLength("hello"));
}
}