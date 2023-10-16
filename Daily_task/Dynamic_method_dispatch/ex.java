class Phone{
    public void Greet(){
        System.out.println("good morning");
    }
    public void ON(){
        System.out.println("Phone is turning on");
    }
    public void time(){
        System.out.println("time is 7pm");
    }
    
    

}

class SmartPhone extends Phone{
    @Override
    public void ON(){
        System.out.println("smartphone is starting");
    }

    public void watch(){
        System.out.println("time is 8pm");
    }
    
}

public class ex{
    public static void main(String[] args) {
        // below code is allowed in java
        // we create a object of child class to fetch child class Properties 
        // this is the example of method dispatching
        // ********we can say this is an example of Runtime Polymorphism because we decide which object run at a runtime*********
        Phone obj=new SmartPhone();    //allowed
        // SmartPhone obj= new Phone();  // Not allowed     
        // obj.ON();
        // obj.time(); //Allowed
        
        obj.Greet();
        obj.time();
        
        // obj.watch();   // not allowed because we cant use methods from child , if same method is not present in parent
    }
}