package multithreading;

public class Flavor2Demo {
    // An anonymous class that implements Hello interface 

   static What what = new What() {
        @Override
        public void show() {
            System.out.println("WHAAT ");
        }
    };


    public static void main(String[] args) {
        
what.show();
  
    }
}

interface What{
    void show();
    
}
