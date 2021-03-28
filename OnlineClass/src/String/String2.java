
package String;

public class String2 {
     public static void main(String[] args) {
        String firstname="Tanvir";
        String lastname=" Ahammed";
        String fullname1=firstname+lastname;
        String fullname2=firstname.concat(lastname);
        System.out.println("full name ="+fullname1);
        System.out.println("full name using method="+fullname2);
        
        
        String upperName=fullname1.toUpperCase();
        System.out.println("Uppername ="+upperName);
        String lowerName=fullname1.toLowerCase();
        System.out.println("Lowername ="+lowerName);
        boolean b=firstname.startsWith("T");
        {
            System.out.println("b ="+b);
        }
        boolean c=lastname.endsWith("d");
        {
            System.out.println("c ="+c);
        }
    }
    
}
