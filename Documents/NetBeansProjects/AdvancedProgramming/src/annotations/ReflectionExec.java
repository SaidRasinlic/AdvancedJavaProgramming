package annotations;

import annotations.Huawei;
import annotations.SmartPhone;
import java.lang.annotation.Annotation;

public class ReflectionExec {

    
    public static void main(String[] args) {
        
        Huawei obj = new Huawei(5.8, "Huawei P20 Lite");
  
       Class clazz = obj.getClass();
       
Annotation an = clazz.getAnnotation(SmartPhone.class);


   SmartPhone s = (SmartPhone) an;
   
        System.out.println(s.os());    
        System.out.println(s.version());


    }

}
