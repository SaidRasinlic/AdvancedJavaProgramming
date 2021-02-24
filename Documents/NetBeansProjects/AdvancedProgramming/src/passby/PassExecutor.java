package passby;

public class PassExecutor {

    public static void main(String[] args) {

        PassBySomething result1 = new PassBySomething();

        result1.carModel = "BMW";
        result1.carModel = "Audi";
        result1.passByReference(result1);
        System.out.println(result1.carModel);

        int x = useVarargs(10, 10, 10);

        System.out.println(x);

        int number = 50;
        int num = passByValue(number);
        System.out.println(num);

    }

    public static int passByValue(int number) {
        return number = 100;
        // ako stavimo void onda ne radi...

    }

    public static int useVarargs(int... Operands) {
        int result = 0;
        for (int i = 0; i < Operands.length; i++) {
            result += Operands[i];
        }
        return result;
    }

}
