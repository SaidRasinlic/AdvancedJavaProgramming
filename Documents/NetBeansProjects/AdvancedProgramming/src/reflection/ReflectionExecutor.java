package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionExecutor {

    public static void main(String[] args) {

        try {
            Said obj = new Said();
            Class clazz = Said.class;
           // Class clazz1 = Class.forName("refleksija.Said");
            Class clazz2 = obj.getClass();

//interfejs i superklasa
            Class[] objInterfaces = clazz.getInterfaces();
            Class objSuperClazz = clazz.getSuperclass();

            int objModifiers = clazz.getModifiers();
//pristup poljima ili varijablama u ovom slucaju public javnim
            Field field1 = clazz.getField("name");
            field1.set(obj, "Said");
            String typeValue1 = (String) field1.get(obj);
//ovo su privatne,protected,default varijable
            Field field2 = clazz.getDeclaredField("age");
            field2.setAccessible(true);
            field2.set(obj, 31);

            int typeValue2 = (Integer) field2.get(obj);
//pretvaranje modifikatora iz int u string...
            int mod1 = field1.getModifiers();
            int mod2 = field2.getModifiers();

            String modifier1 = Modifier.toString(mod1);
            String modifier2 = Modifier.toString(mod2);

            Field[] objVariables = clazz.getDeclaredFields(); // ovo su varijable ili polja ili atributi private,public,protected itd

            Method[] objMethods = clazz.getDeclaredMethods();
            for (Method m : objMethods) {
                System.out.println("Method name: " + m.getName());

                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                System.out.println("Return type: " + m.getReturnType());

                System.out.println(" ");
            }

            System.out.println("Methods: " + Arrays.toString(objMethods));
            System.out.println("Type `name` public variable: " + typeValue1 + "\nModifikator: " + modifier1);
            System.out.println("Type `age` private variable: " + typeValue2 + "\nModifikator: " + modifier2);
            System.out.println("Variables: " + Arrays.toString(objVariables));
            System.out.println("Interfaces: " + Arrays.toString(objInterfaces));
            System.out.println("Modifikator je: " + Modifier.toString(objModifiers));
            System.out.println("Superklasa je: " + objSuperClazz.getName());
           // System.out.println("Ime klase je: " + clazz1.getName());
            System.out.println("Ime klase je: " + clazz.getName());
            System.out.println("Ime klase je: " + clazz2.getName());

            Constructor[] objConstructor = clazz.getDeclaredConstructors();

            for (Constructor c : objConstructor) {
                System.out.println("Constructor name: " + c.getName());
                int modifierCons = c.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifierCons));
                System.out.println("Parametres count: " + c.getParameterCount());
                System.out.println("Parametres type: " + Arrays.toString(c.getParameterTypes()));
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException ex) {
            System.err.print(ex.getLocalizedMessage());

        }
    }
}
