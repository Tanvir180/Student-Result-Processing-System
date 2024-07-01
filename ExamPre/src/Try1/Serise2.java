
package Try1;
import java.util.Scanner;
public class Serise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = input.nextInt();
        System.out.println(" Enter The Array : ");
        int [] arr= new int[n+9];
        int i, j; 
        int temp=0;
        for(i=1;i<=n;i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Enter the position where you want to add number: ");
        int x= input.nextInt();
      
        System.out.println("Enter the value: ");
        int v = input.nextInt();
        temp=arr[x];
        arr[x]=v;
        for(i=x;i<=n+1;i++)
        {
            int temp2=0;
            temp2= arr[i+1];
            arr[i+1]=temp;
            temp= temp2;
                //temp= arr[i];
               
       
            
        }
        System.out.println("tHE ARRAY IS: ");
         for(i=1;i<n+2;i++){
             System.out.println(arr[i]);
         }
    }
}
