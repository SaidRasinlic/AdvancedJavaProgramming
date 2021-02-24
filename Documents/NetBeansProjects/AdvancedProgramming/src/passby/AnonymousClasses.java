package passby;

@FunctionalInterface
interface TypeOfMoney {

    public void cashFlow();
}

class AnonymousClasses {

    public static void main(String[] args) {
        Thread t = new Thread(AnonymousClasses::printThis);
        t.start();

    }

    public static void printThis() {
        System.out.println("test");
    }
}
