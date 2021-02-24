package passby;

public class Coach extends InheritExec {

    public Coach(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    void printIt() {
        System.out.println("Hello from the coach man!");
    }

}
