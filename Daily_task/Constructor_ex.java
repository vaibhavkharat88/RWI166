class Myemployee {
    private String Name;
    private int age;

    public Myemployee(){
        Name="vaibhav kharat";
        age=25;

    }

    public String getName(){
        return Name;
    }
    public int getage(){
        return age;
    }
    public void setName(String n){
        Name=n;
    }
    public void setage(int i){
        age=i;
    }

    
}

public class Constructor_ex{
    public static void main(String[] args) {
        Myemployee em1=new Myemployee();
        // if we use constructor dont need to set a value like following just make a same name method of class .then its automatically invokes it in main class.
        // em1.setName("vaibhav");
        // em1.setage(25);

        System.out.println(em1.getName());
        System.out.println(em1.getage());

        
    }
}
