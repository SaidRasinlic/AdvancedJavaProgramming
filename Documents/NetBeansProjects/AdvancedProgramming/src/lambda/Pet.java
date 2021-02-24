package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Pet {

    default void defaultShow() {
        System.out.println("Whats up from DEFAULT SHOW");
    }

    public void test();

    public class Dog implements Pet {

        @Override
        public void test() {
            System.out.println("Interface Method Implemented");
        }

        public static void main(String[] args) {

            Dog d = new Dog();

            d.test();
            Pet p = new Dog();

            p.test();

            Pet pet = () -> {
                System.err.println("ssssss");
            };

            Map<String, Integer> ages = new HashMap<>();
            ages.put("John", 25);
            ages.put("Freddy", 24);
            ages.put("Samuel", 30);

            ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));

            System.out.println("Main thread is- "
                    + Thread.currentThread().getName());
            Thread t1 = new Thread(new Dog().new RunnableImpl());
            t1.start();
        }

        class RunnableImpl implements Runnable {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + ", executing run() method!");
                
                
            }

            
        }

    }
}
