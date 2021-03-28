package Multithreading;

public class ThirdClass extends Thread {

    @Override
    public void run() {
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Class Third  : " + i);
            }
            System.out.println("Exit Form Third Class");
        }
    }
}
