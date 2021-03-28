package array;
import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
      double[] number; //declaration
      number= new double[10];//creation
      Scanner input =new Scanner(System.in);
      int size=number.length;
      System.out.println("Array size is ="+size);
      int i;
      for(i=0;i<number.length;i++)
      {
          number[i]=input.nextDouble();
      }
      double sum=0,avg;
      for(i=0;i<number.length;i++)
      {
          sum=sum+number[i];
      }
      System.out.println("sum is="+sum);
      avg=sum/number.length;
      System.out.println("Avrage is:"+avg);
    }
    
}
