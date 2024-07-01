
package Multithreading;

public class Main {
    public static void main(String[] args) {
        //Thread class
        FirstClass fc =new FirstClass();
        SecondClass sc =new SecondClass();
        ThirdClass tc =new ThirdClass();
        
        //runnable interface
        FourthClass frc =new FourthClass();
        //Converting interface as thread
        Thread tfrc = new Thread(frc);
        
        fc.start();
        sc.start();
        tc.start();
        //runnable dont have start function
        //frc.run();
        //converting to thread gives start function
        tfrc.start();
    }
  
}
