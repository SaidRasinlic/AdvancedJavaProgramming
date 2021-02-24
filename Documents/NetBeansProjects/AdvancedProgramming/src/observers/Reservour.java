package observers;

public class Reservour {

    private int reserveLimit = 10;
    private int totalAmount = 100;

    private void reserveIndicator() {

        System.out.println("Hey, I am on reserve! Please refill me!");
    }

    public void getFuel() {
        if (--totalAmount <= reserveLimit) {
            reserveIndicator();
        }
        System.out.println("Total amount: " + totalAmount);
    }

}

/*
   Reservour res = new Reservour();

        for (int i = 0; i < 100; i++) {
            res.getFuel();
        }

*/
