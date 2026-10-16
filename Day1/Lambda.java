//Lambda
//package Day1;

/**
 * lambda
 
 interface Greeter  {
    void greet(Strinbg name);
}
public class Lambda{
    public static void main(String[] args){
        Greeter g = name -> System.out.println("Hello,"+name);
        g.greet("Harish");
    }
}
*/

/* import java.util.function.*;
public class Lambda{
    public static void main(String[] args){
        Function<String,Integer> getLength=name -> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("Harish"));
  }
} */
import java.util.function.*;
public class Lambda{
    public static void main(String[] args){
        Consumer<String> smsNotifier = mobNo->{
            System.out.print("Sending the OTP to the ph no.:"+mobNo);

        };
        smsNotifier.accept("=91 9618347496");
        
  }
}