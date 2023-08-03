interface human{
    void say();
}

interface alien{
    void say();
    String planet="Earth";
}

class Boy implements human{
    public void say(){                          //inherited method should be set to public
        System.out.println("i am a boy");     //cannot reduce the visibility
    }
}

class Me implements alien, human{
    
    public  void sayPlanet(){
        System.out.println("From "+ planet);
    }

    public void say(){
        System.out.println("I am Messi!");
    }   
}

class Girl implements human{
    public void say(){                          //must implement all the methods from the interface
        System.out.println("i am a Girl");
    }
}

public class InterfaceExample{

    public static void main(String[] args) {
        
        human me= new Boy();
        me.say();
        System.out.println("-----------------------------");
        Me goat= new Me();
        goat.say();
        goat.sayPlanet();
        
    }
}