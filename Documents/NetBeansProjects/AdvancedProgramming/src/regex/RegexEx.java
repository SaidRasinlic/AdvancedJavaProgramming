package regex;

import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    //1. bounded i unbounded -> genericki tipovi
//2. WILDCARDS - dzokerski tipovi
//2.1 unbounded 
//2.2 upper bounded
//2.3 lower bounded
    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("bing");
        
        Matcher m = p .matcher("bing, bang, bong, bung");
        
        System.out.println("String contains word: " + m.find() );
        System.out.println(m.replaceAll("HELLO"));
        
        

        
        System.out.println("Match if string contains any numbers from 0 to 9");
        
        p = Pattern.compile(".");
        
       m=p.matcher("I don't have any number");
        System.out.println(m.find() + " " + m.toString());
        
        
     
        
    }
    
    
    
}
