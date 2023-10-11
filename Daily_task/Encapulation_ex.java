class Member{
    private String Name;
    private int  age;
    public void setname(String n){
        Name=n;
    }
    
    public void setage(int a){
        age=a;
    }
    public String getname(){
        return Name;
    }
    public int getage(){
        return age;
    }


}
public class Encapulation_ex{
    public static void main(String[] args) {
        Member mem1=new Member();
        mem1.setname("vaibhav");
        mem1.setage(5);
        System.out.println(mem1.getname());
        System.out.println(mem1.getage());

        
    }
} 
    
// Write a car rental system program to find the availanbilty of a car in a particular slot time
