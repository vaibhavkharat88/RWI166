abstract class Parent{
    abstract public void greet();
    abstract public void name();


}
class child extends Parent{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("vaibhav");
    }
}
public class Abstract{
    public static void main(String[] args) {
        child c1=new child();
        c1.greet();
        c1.name();
    }
}