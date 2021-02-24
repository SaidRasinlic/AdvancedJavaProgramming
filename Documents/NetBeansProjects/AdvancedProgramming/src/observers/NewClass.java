package observers;

import java.util.ArrayList;

public class NewClass<T extends Number> {

    public static <A, B> String myMethod(A a, B b) {
        String left = String.valueOf(a);
        String right = String.valueOf(b);
        return left + right;
    }

   
     T value;

    public void show() {
        System.out.println(value.getClass().getName());
 }

    public void demo(ArrayList< ? super T> obj) {

    }

    public static void main(String[] args) {
        System.out.println(myMethod(10, 20));
        System.out.println(myMethod("Hello", " World"));

        NewClass obj = new NewClass();

        obj.value = 1;
        obj.show();
        obj.demo(new ArrayList<Number>());
obj.show();
    }

}
