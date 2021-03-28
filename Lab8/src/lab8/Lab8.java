
package lab8;

import java.util.Scanner;


public class Lab8 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String icetype,iceCompany;
        double icePrice;
        System.out.println("Enter icecream type: ");
        icetype = input.nextLine();
        System.out.println("Enter iceream Company: ");
        iceCompany = input.nextLine();
        System.out.println("Enter iceceam price: ");
        icePrice = input.nextDouble();
       Icecream ice1 = new Icecream();
       Icecream ice2 = new Icecream(icetype,iceCompany,icePrice);
        System.out.println(ice1);
        System.out.println(ice2);
    }
   
}
