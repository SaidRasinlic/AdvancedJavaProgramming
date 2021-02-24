package observers;

import java.util.EventObject;
import observers.Reservoir;
import observers.ReservoirListener;

public class CarEvents {

    public static void main(String[] args) throws InterruptedException {

        Reservoir res = new Reservoir();
        res.addEventListener(new ReservoirListener() {
            @Override
            public void reserveReached(EventObject evt) {
                System.out.println("No more fuel in car. Please refill!");

            }
        });

       
        
        
        for (int i = 0; i < 100; i++) {

            res.consumeFuel();
            if (i == 99) {
                System.out.println("BOOOOOOM IM DEAD!!!!");
            } else {
                Thread.sleep(100);

            }

        }

    }
}
