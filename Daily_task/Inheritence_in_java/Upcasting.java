class first{
    void show(){
        System.out.println("show");
    }
}

class second  extends first{
    @Override
    void show(){
        System.out.println("second show");
    }
    void wow(){
        System.out.println("wow its happens due to downcasting");
    }
}

public class Upcasting{
    public static void main(String[] args) {
        // upcasting
        first f=new second();
        f.show();
        // downcasting
        ((second)f).wow();
    }
}


