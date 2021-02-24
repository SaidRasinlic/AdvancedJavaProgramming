package passby;

public abstract class InheritExec {

    abstract void printIt();

    String firstName;
    String lastName;

    public InheritExec(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   private void show() {
        System.out.println(firstName + " " + lastName);

    }

    public static void main(String[] args) {

        InheritExec coach = new Coach("Said", "Rasinlic");
        coach.show();
        Player player = new Player("CR", "7");
        player.someMethod();
      
        InheritExec[] list = new InheritExec[2];
        list[0] = coach;
        list[1] = player;

        for (int i = 0; i < list.length; i++) {
            list[i].printIt();
        }
    }
}
