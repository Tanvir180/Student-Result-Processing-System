package Multithreading;

public class SecondClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Class Second  : " + i);
        }
        System.out.println("Exit Form second Class");
    }
}
