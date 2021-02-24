package annotations;

import annotations.Locale;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

@Locale(language = "bh")

public class UserMessageService {

    Map<String, String> messages = new HashMap<>();

    public void showWelcomeMessage(Locale l) {

        messages.put("bh", "Zdravo");
        messages.put("sp", "Hola");
        messages.put("ar", "Marhaba");
        messages.put("ch", "Nihao");
        messages.put("ge", "Guten tag");
        messages.put("fr", "Bonjour");

        switch (l.language()) {
            case "bh":

                System.out.println(messages.get("bh"));
                break;
            case "sp":
                System.out.println(messages.get("sp"));
                break;
            case "ar":
                System.out.println(messages.get("ar"));
                break;
            case "ch":
                System.out.println(messages.get("ch"));
                break;
            case "ge":
                System.out.println(messages.get("ge"));
                break;
            case "fr":
                System.out.println(messages.get("fr"));
                break;
            default:
                System.err.println("Error, please check your country tag.");
                break;
        }

    }

    public static void main(String[] args) {

        UserMessageService user = new UserMessageService();

        Class clazz = user.getClass();

        //   Locale myAno = (Locale) clazz.getAnnotation(Locale.class);
        // System.out.println(myAno.language());
        Annotation an = clazz.getAnnotation(Locale.class);

        Locale l =  (Locale) an;
        System.out.println(l);
   
        user.showWelcomeMessage(l);

 
        
    }

}
