public class  first{
    public static void main(String[] args) {
        // Program for checking given string are same or not
        String ex1 = "Welcome";
        String ex2 = "Welcome";
        if(ex1 == ex2)
        System.out.println("same");
        else
        System.out.println("not same");
        // converting number to its ascii value
        byte[] bytes = {100,101,102};
        String str =new String(bytes);
        System.out.println(str);

        // find length of string
        String str1="Hii this is vaibhav";
        System.out.println(str1.length());

        // charAt
            String str2="Hii this is vaibhav";
            System.out.println(str2.charAt(5));
        // concataion of two string
            String str3="Hii this is vaibhav";
            String str4="Hii this is aniket";
            System.out.println(str3.concat(str4));
        



        
            }
        }