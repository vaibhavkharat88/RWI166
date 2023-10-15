class Base1{
    Base1(){
        System.out.println("i am a base constructor");
    }
    Base1(int a){
        System.out.println("this is a overloading constructor and its value is"+ a);
    }
}

class Derived extends Base1{
    Derived(){
        super(2);
        System.out.println("i am a Derived class constructor ");
    }
}


public class constructor_in_inheritence {
    public static void main(String[] args) {
        Base1 b=new Base1();
        Derived d=new Derived();
        
    }
    
}
