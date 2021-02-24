package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " value: " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class RandomClass {

    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.start();

        MyClass obj1 = new MyClass();
        obj1.start();

    }
}
