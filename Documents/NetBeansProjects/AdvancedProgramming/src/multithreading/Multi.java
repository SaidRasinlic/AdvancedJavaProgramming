package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
import multithreading.Sequence;

public class Multi {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Thread thread = new Thread(new LockedClass(sequence));

        thread.start();

        Thread thread1 = new Thread(new LockedClass(sequence));
        thread1.start();

    }

}

class LockedClass implements Runnable {

    Sequence sequence;

    public LockedClass(Sequence sequence) {

        this.sequence = sequence;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(LockedClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
