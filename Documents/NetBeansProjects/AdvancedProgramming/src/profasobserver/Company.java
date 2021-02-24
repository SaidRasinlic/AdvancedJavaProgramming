package profasobserver;

import java.text.DecimalFormat;

public class Company implements Observer {

    public Company(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Kompanija je dobila notifikaciju od novina");
    }

    static class Sum {

        public static void main(String[] args) {

            int max = 10;
            int min = 1;
            int range = max - min + 1;

            System.out.println("Range number: " + range);

            System.out.println("Random number: ");
            // generate random numbers within 1 to 10 
            for (int i = 0; i < 10; i++) {

                Double rn = Math.random();         
                DecimalFormat df = new DecimalFormat("#.##");
                Double rand = Double.valueOf(df.format(rn * range + min));
                System.out.println("RESULT: " + rand);
                
                
            }

        }
    }
}
