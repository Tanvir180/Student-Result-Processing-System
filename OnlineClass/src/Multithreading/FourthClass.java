package Multithreading;

public class FourthClass implements Runnable {
    //ekane Runnable interface bebohar kora hoyece kenona amra jani thread class ke extends othoba runnable interface ke implements korar maddome thread declare kora jay

    @Override
    public void run() {
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Class fourth  : " + i);
            }
            System.out.println("Exit Form Fourth Class");
        }

    }
}
