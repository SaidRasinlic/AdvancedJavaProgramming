package annotations;

import java.util.List;
import java.util.Stack;

public class Base {

    private List versions;

    @SuppressWarnings({"unchecked", "deprecated"})

    public void addVersion(String version) {
        versions.add(version);
    }

    public void display() {
        System.out.println("Base display()");
    }

    @Deprecated
    public void Display() {
        System.out.println("Deprecatedtest display()");
    }

    public static void main(String[] args) {

        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Said");
        stackOfCards.push("Senad");
        stackOfCards.push("Lamija");
        System.out.println("Stack => " + stackOfCards);
        String cardAtTop = stackOfCards.pop();
        System.out.println(cardAtTop);
         System.out.println("Current Stack => " + stackOfCards);
         cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
    }
}
