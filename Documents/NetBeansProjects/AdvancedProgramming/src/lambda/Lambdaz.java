package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdaz {

    interface InterfacingBoy {

        public void show(String s);

    }

    public static void main(String[] args) {

        List list = new ArrayList(); // raw type

        InterfacingBoy boi = new InterfacingBoy() {
            @Override
            public void show(String s) {
                System.out.println("show from anonymous class " + s);
            }
        };

        boi.show("(String s) in the BOI");

        InterfacingBoy boy = (String s) -> {
            System.out.println("show from lambda expression " + s);
        };

        boy.show("(String s) in the BOY");

        List<Integer> arrayList = new ArrayList();

        arrayList.add(123);
        arrayList.add(12);
        arrayList.add(214);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);

        arrayList.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Arrays.stream(arr).forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }

}
