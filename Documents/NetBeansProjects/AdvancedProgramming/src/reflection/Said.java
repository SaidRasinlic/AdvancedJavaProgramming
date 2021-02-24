package reflection;

public class Said extends SuperSaid implements InterfaceNumberOne, InterfaceNumberTwo {

    private int age;
    public String name;
    private String surname;
    boolean bool;

    public Said() {

    }

    private Said(String name, int age) {

    }

    public Said(boolean bool) {

    }

    private void printAge() {
        System.out.println("Printing age");
    }

    protected void printName() {
        System.out.println("Printing name;");
    }

    public void printSurname() {
        System.out.println("Printing surname");
    }

    @Override
    public void displaySecondInterface() {
        System.out.println("I am Interface number one");

    }

    @Override
    public void displayFirstInterface() {
        System.out.println("I am Interface number two");

    }

    @Override
    public void show() {
        super.show();
    }

}
