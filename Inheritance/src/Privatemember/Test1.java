
package Privatemember;


import java.util.Scanner;
public class Test1 {
     public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Teacher1 ob1 =new Teacher1();
       
         System.out.println("Enter name");
         ob1.setName("Hridoy");
         System.out.println("Enter age");
         ob1.setAge(20);
         System.out.println("Enter Qualification");
         ob1.setQualification("Hsc");
         System.out.println(ob1.getName());
         System.out.println(ob1.getAge());
         System.out.println(ob1.getQualification());
     }
}
