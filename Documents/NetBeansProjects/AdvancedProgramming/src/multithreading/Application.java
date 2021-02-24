package multithreading;

import multithreading.Sequence;

public class Application {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Worker worker1 = new Worker(sequence);

        worker1.start();

        Worker worker2 = new Worker(sequence);
        worker2.start();

    }

}

class Worker extends Thread {

    Sequence sequence = null;

    public Worker(Sequence sequence) {
        this.sequence = sequence;

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " value: " + i);

            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
            }

        }
    }

}



/*
public class Application {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Worker work1 = new Worker(sequence);
        work1.start();

        Worker work2 = new Worker(sequence);
        work2.start();

        //Thread thread = new Thread(new LockedClass(sequence));
        // thread.start();
        //  Thread thread1 = new Thread(new LockedClass(sequence));
        // thread1.start();
    }
}

class Worker extends Thread {

    Sequence sequence;

    public Worker(Sequence sequence) {

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







*/
