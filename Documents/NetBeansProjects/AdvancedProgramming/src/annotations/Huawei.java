package annotations;

import annotations.SmartPhone;


@SmartPhone(os="Android",version=10)
public class Huawei {
    
    double size;
    String name;
    
    Huawei(double size, String name){
        this.size=size;
        this.name=name;
        
    }

}
