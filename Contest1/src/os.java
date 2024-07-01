import java.util.*;
import java.lang.*;
import java.net.*;

public class os
{
  public static void main(String args[]) {
    System.out.println();
    try{
      String osName= System.getProperty("os.name");
      System.out.println("The Operating System you are using is :=> "+ osName);
    }catch (Exception e){
      System.out.println("Exception caught ="+e.getMessage());
    }
//        System.out.print("\n");
//        System.out.print("\t\t===================================================== " );
//        System.out.println("\n\t\t\t THANK YOU for USING this PROGRAM" ); 
//        System.out.println("\t\t\t Program Coding & Design By: ");
//        System.out.println("\t\t\t Jake Rodriguez Pomperada,MAED-IT " );
//        System.out.print("\t\t===================================================== " );
//        System.out.print("\n");     

  }
} 