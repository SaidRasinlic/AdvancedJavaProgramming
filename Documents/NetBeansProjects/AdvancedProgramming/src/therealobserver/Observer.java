package therealobserver;

public interface Observer {
    // The Observers update method is called when the Subject changes

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}
