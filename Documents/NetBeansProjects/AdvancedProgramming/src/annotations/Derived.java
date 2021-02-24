package annotations;

import annotations.Base;

public class Derived extends Base {

  @SuppressWarnings( {"checked", "deprecation"} ) 
    
     @Override
     public void display() 
     { 
         System.out.println("Derived display(int )"); 
     } 
  

    
    public static void main(String[] args) {
        
        
        
     Derived obj = new Derived(); 
    obj.Display();
         
         
         
     }
    
  
    
}
