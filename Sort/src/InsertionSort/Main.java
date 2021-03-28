
package InsertionSort;
import java.util.*;
 public class Main {
  public static void main(String[] args) 
  {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array");
           int n=input.nextInt();
          int []A=new int[n];
           System.out.println("Enter the Array");

          for(int i=0;i<n;i++)
         {
            A[i]=input.nextInt();
          }    
         
          //for shorting
          for(int i=1;i<=(n-1);i++)
          {
              int hole,value;
              value=A[i];
              hole=i;
              while(hole>0 && A[hole-1]>value)
              {
                  A[hole]=A[hole-1];
                  hole=hole-1;
              }
              A[hole]=value;
          }
          for(int i=0;i<n;i++)
          {
              System.out.println(A[i]);
          }
  } 
}
