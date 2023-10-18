class mobile{
    void camera(){
        System.out.println("u can open a camera");
    } 
}
class Laptop extends mobile{
    void coding(){
        System.out.println("able to do coding ");
        super.camera();
    }
    @Override 
    void camera(){
        System.out.println("u can open a camera of laptop also");
        super.camera();
    }
}


public class Single_inheritence {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.camera();
        l1.coding();
        
    }
}
