package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FirstClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Class First : " + i);
            if (i == 3) {
                try {
                    System.out.println("Class First Sleeping");
                    sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FirstClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Exit Form First Class");
        }
    }

}
