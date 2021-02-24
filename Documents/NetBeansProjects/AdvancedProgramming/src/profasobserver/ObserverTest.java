package profasobserver;

public class ObserverTest {

    public static void main(String[] args) {
        //ONE->TO->MANY
        //ONE
        Newspaper newspaperObservable = new Newspaper();
        //MANY
        Observer personObserver = new Person(newspaperObservable);
        Observer companyObserver = new Company(newspaperObservable);
  
        //    newspaperObservable.removeObserver(personObserver);
       newspaperObservable.notifyObserver();

    }
}
