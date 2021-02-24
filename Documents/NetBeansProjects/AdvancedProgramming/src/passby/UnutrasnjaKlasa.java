package passby;

public class UnutrasnjaKlasa {

    @FunctionalInterface
    interface Grow {   // anonymous

        public int grow(int a);

    }

    public void show() {
        System.out.println("Machine starting");
    }

    class Inner {

        public void display() {
            System.out.println("Hello from inner class");
        }
    }

    public static void main(String[] args) {

        UnutrasnjaKlasa klasa1 = new UnutrasnjaKlasa();

        UnutrasnjaKlasa.Inner klasa2 = klasa1.new Inner();//  postoji i ova   UnutrasnjaKlasa.Inner klasa2 =new UnutrasnjaKlasa().new Inner();
// ako je static klasa onda ide    UnutrasnjaKlasa.Inner klasa2 = new Inner(); 
//   UnutrasnjaKlasa.Inner klasa2 = klasa1.new Inner(); 
        klasa2.display();

        UnutrasnjaKlasa unutrasnja = new UnutrasnjaKlasa() {
            @Override
            public void show() {
                System.out.println("Machine stopped working!");
            }

        };
        unutrasnja.show();

        Grow something = (int a) -> {
            System.out.println("RASTEM " + a);
            return a;
        }; // anonymous

        something.grow(5);

    }

}
  

/*



    }
    //  public static void printMessage(){
    //    System.out.println("Hello Im the best! HEHE");

    public static void main(String[] args) {

        //    Thread t = new Thread(()->  printMessage());
        //  Thread t = new Thread(MethodReferenceExample1::printMessage);// MethodReferenceExample1 == () - > printMessage();
        //   t.start();
public class Test {

    // Java program to demonstrate working of lambda expressions 
    // operation is implemented using lambda expressions 
    interface FuncInter1 {

        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions 
    // above 
    interface FuncInter2 {

        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b' 
    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {
        // lambda expression for addition for two parameters 
        // data type for x and y is optional. 
        // This expression implements 'FuncInter1' interface 
        FuncInter1 add = (int x, int y) -> x + y;

        // lambda expression multiplication for two parameters 
        // This expression also implements 'FuncInter1' interface 
        FuncInter1 multiply = (int x, int y) -> x * y;

        // Creating an object of Test to call operate using 
        // different implementations using lambda Expressions 
        Test tobj = new Test();

        // Add two numbers using lambda expression 
        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression 
        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));

        // lambda expression for single parameter 
        // This expression implements 'FuncInter2' interface 
        FuncInter2 fobj = message -> System.out.println("Hello "
                + message);
        fobj.sayMessage("Geek");
    }
}
    interface Addable {

        int add(int a, int b);
    }
    //  public static void printMessage(){
    //    System.out.println("Hello Im the best! HEHE");

    public static void main(String[] args) {

        //    Thread t = new Thread(()->  printMessage());
        //  Thread t = new Thread(MethodReferenceExample1::printMessage);// MethodReferenceExample1 == () - > printMessage();
        //   t.start();
        Addable obj = (a, b) -> (a + b);
        System.out.println(obj.add(100, 205));

        // Multiple parameters in lambda expression  
        Addable object2 = (a, b) -> (a + b);
        System.out.println(object2.add(10, 20));

        // Multiple parameters with data type in lambda expression  
        Addable object3 = (int a, int b) -> (a + b);
        System.out.println(object3.add(100, 200));

*/