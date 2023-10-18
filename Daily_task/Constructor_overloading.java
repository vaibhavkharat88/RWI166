class Rectangle{
    private int length; 
    private int breadth; 
    //default constructor
    public Rectangle(){
        this.length= 5;
        this.breadth=4;
     }
    //parametric constructor
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getlength(){
        return length;

    }
    public int getBreadth(){
        return breadth;
        
    }
    public int Area(){
        int value;
        value=this.length*this.breadth;
        return value;

    }
}
public class Constructor_overloading{
    public static void main(String[] args) {
        // default values
        Rectangle r1=new Rectangle();
        System.out.println("default constructor");
        System.out.println(r1.getlength());
        System.out.println(r1.getBreadth());
        System.out.println(r1.Area());
        
        // constructor with Arguments

        Rectangle r2=new Rectangle(25, 10);
        System.out.println("constructor with Arguments");
        System.out.println(r2.getlength());
        System.out.println(r2.getBreadth());
        System.out.println(r2.Area());

        //System.out.println(r2.Area(10,20));

        

    }
}