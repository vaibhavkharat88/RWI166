class Animal{
    void show(){
        System.out.println("hii this is parent show");
    }
}
class fish extends Animal{
    @Override
    void show(){
        System.out.println("hii this is child show");
    }
    void greet(){
        System.out.println("namaskar");
    }

}


public class ex {
    public static void main(String[] args) {
        Animal a=new fish();
        a.show();

        ((fish)a).show();


        
    }
}
