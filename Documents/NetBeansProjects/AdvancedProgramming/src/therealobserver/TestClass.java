package therealobserver;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

class A {

    static int num1;
    static int num2;

    public static void show() {
        num1++;
        System.out.println(num1++);
        System.out.println(num1++);
    }
}

// 12,13,19,20,22,25,26,29,32  ,34,35,38,50 pod hitno ,51 interesantno , 54 ,57,59
public class TestClass {

    char c;

    public void m1() throws Exception {
        char[] cA = {'a', 'b'};
        m2(c, cA);
        System.out.println(((int) c) + "," + cA[1]);
    }

    public void m2(char c, char[] cA) {
        c = 'b';
        // cA[1] = cA[0] = 'm';

        cA = new char[4];

    }

    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        
        LocalDate ld2 = ld.plus(Period.ofMonths(1).ofDays(1).ofWeeks(4));
        
        System.out.println(ld2);
        
        StringBuilder sb = new StringBuilder(100);

        sb.ensureCapacity(100);

        String said = "said";
        System.out.println("said".equals(said));

        char cA[][] = {new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}, new char[]{}};

        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);

        Byte b = new Byte((byte) 2);

        Integer in = new Integer(2);

        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

        System.out.println(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY).adjustInto(LocalDate.now()));

        System.out.println(LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(1090, DayOfWeek.FRIDAY)));

        A.num2 = 10;
        System.out.println(A.num2);
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();

        obj1.num1 = 2;
        obj2.num1 = 3;
        obj3.num1 = 4;

        System.out.println(obj1.num2);
        System.out.println(obj2.num2);
        System.out.println(obj3.num2);

        obj1.show();
        /*  System.out.println(obj1.num1 + " obj1");
        System.out.println(obj2.num1 + " obj2");
        System.out.println(obj3.num1 + " obj3"); */

    }
}
// 18,17 pitanje 30,32,34,36,37,40,43,44,46,49,50,52,53,54,55,63,67

class SomeThrowable extends Throwable {
}

class MyThrowable extends SomeThrowable {
}
