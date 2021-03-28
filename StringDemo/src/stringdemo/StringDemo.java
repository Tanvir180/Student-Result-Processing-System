 
package stringdemo;

public class StringDemo {

    public static void main(String[] args) {
        String s1="Tanvir Ahammed";
        String s2=new String("Tanvir Ahammed");
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        int len1=s1.length();
        int len2=s2.length();
        System.out.println("Length1 is ="+len1);
        System.out.println("Length2 is ="+len2);
        if(s1.equals(s2))
        {
            System.out.println("Equals");
            
        }
        else
        {
             System.out.println("NOT Equal");
        }
        if(s1.contains("Ahammed"))
        {
           System.out.println("it contaions ahammed");
        }
        else
        {
            System.out.println("not contains");
        }
     String s3="Tanvir Ahammed";   
     String s4="tanvir ahammed";
     System.out.println("s3="+s3);
        System.out.println("s4="+s4);
         if(s3.equalsIgnoreCase(s4))
        {
            System.out.println("Equals");
            
        }
        else
        {
             System.out.println("NOT Equal");
        }
        boolean condition=s3.contains("Tanvir");
                {
                    System.out.println(condition);
                }
     
    }
    
}
