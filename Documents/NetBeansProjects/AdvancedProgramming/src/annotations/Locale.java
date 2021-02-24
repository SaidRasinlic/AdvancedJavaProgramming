package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)




public @interface Locale {
 
    String language(); 

   

        /*  Map<String, String> messages = new HashMap<>();

        messages.put("bh", "Zdravo");
        messages.put("sp", "Hola");
        messages.put("ar", "Marhaba");
        messages.put("ch", "Nihao");
        messages.put("ge", "Guten tag");
        messages.put("fr", "Bonjour");

        Set< Map.Entry< String, String>> st = messages.entrySet();

        for (Map.Entry me : messages.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());

        }
         */
    
}
