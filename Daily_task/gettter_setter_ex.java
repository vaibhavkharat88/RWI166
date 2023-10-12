class Cylinder{
    private int Height;
    private int radius;
    public void setheight(int h){
        this.Height=h;

    }
    
    public void setradius(int i){
        this.radius=i;

    }
    public int getheight(){
        return Height;
    }
    public int getradius(){
        return radius;
    }
    
}



public class gettter_setter_ex {
    public static void main(String[] args) {
        Cylinder cy1=new Cylinder();
        cy1.setheight(10);
        cy1.setradius(20);
        System.out.println(cy1.getheight() );
        System.out.println( cy1.getradius());

        
    }
    
}
