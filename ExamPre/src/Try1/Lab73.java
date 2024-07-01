
package Try1;
import java.util.Scanner;
public class Lab73 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String str;
         int f=1;
         System.out.println("Enter The student number:");
         int x= input.nextInt();
         int [] arr = new int[x];
         String [] s= new String[x];
         for(int i=0;i<x;i++){
             System.out.println("Enter"+(f+i)+"student name and score");
             s[i]=input.next();
             
             arr[i]=input.nextInt();
             
         }
         int temp=0;
         
          for(int i=0; i<x; i++){
            for(int j=i+1; j<x; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]= temp;
                    
                    str=s[j];
                    s[j]=s[i];
                    s[i]= str;
                }
            }
        }
          for(int i=0;i<x;i++)
        {
            System.out.println(s[i]+"'s score is "+arr[i]);
        }
         
    }
}
