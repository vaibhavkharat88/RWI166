class parent{
    int a;
    public int getA(){
        return a;
    }
    parent(int a){
        this.a=a;
    }
}
class child extends parent{
    child(int d){ 
        super(d);
        System.out.println("i am a construcor");
    }
}

public class Super_in_java {
    public static void main(String[] args) {
        child c=new child(5);
        System.out.println(c.getA());
    }
}
