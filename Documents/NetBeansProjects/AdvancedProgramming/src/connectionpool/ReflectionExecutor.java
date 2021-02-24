package connectionpool;

import connectionpool.Bank;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;

public class ReflectionExecutor {

    public static void main(String[] args) {

        try {

            Bank bank = new Bank(null, null, null, null, null, null, null);

            Class clazz = Bank.class;

            System.out.println("Class: " + clazz.getName());

            Field[] field = clazz.getDeclaredFields();
            System.out.println("Fields: " + Arrays.toString(field));

            Constructor[] cons = clazz.getDeclaredConstructors();
            System.out.println("Constructor: " + Arrays.toString(cons));
            
            for(Constructor c : cons){
                System.out.println("Constructor name: " + c.getName());
                int paramTypes = c.getModifiers();
                System.out.println("Parameter count: " + c.getParameterCount());
              
                  System.out.println("Parametres type: " + Arrays.toString(c.getParameterTypes()));
                  
                  
                  System.out.println("Modifiers:  " +  Modifier.toString(paramTypes));
                  
                  
            }
            

            System.out.println("Parametres: ");
            
            Field field1 = clazz.getDeclaredField("id");
            field1.setAccessible(true);
            field1.set(bank, 2222);
            int typeValue1 = (Integer) field1.get(bank);
            System.out.println("Field: " + typeValue1);

            Field field2 = clazz.getDeclaredField("birthday");

            field2.setAccessible(true);
      
 java.sql.Date sql = java.sql.Date.valueOf(LocalDate.of(2000, 01, 14));

 LocalDate date = LocalDate.of(2000, Month.JANUARY, 14);
 
 Date sqlDate = java.sql.Date.valueOf(date);
    
 String x = sqlDate.toString();
            
            
        field2.set(bank, x);

  String typeValue2 = (String) field2.get(bank);

            System.out.println("Birthday: " + typeValue2);
            Method[] methods = Bank.class.getMethods();

            System.out.println("Methods: " + Arrays.toString(methods));
            
            
            Class superclazz = clazz.getSuperclass();
            System.out.println("Super class: "+superclazz);
            
            Class<Bank> mc_class = Bank.class;
          for(Annotation a : mc_class.getAnnotations()){
              System.out.println("Annotations: " + a.toString());
          }
            

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

}
