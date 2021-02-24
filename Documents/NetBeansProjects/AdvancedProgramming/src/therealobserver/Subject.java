package therealobserver;

public interface Subject { // OBSERVABLE
    // This interface handles adding, deleting and updating

// all observers
    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyObserver();

}
