class parent{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int a){
        this.x=a;
    }

}
class child extends parent{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int b){
        this.y=b;
    }
    public int sum(){
        return this.x+this.y;
    }
}


public class single_level{
    public static void main(String[] args) {
        child c1=new child();
        c1.setX(5);
        c1.setY(10);
        System.out.println(c1.sum());

    }
}