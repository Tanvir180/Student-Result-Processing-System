
package Try1;
import java.util.Scanner;
public class serice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Serise: ");
        int i;
        int temp=0;
        int [] arr;
        arr= new int[10];
        for(i=0; i<5; i++){
            arr[i]= input.nextInt();
        }
        
        for(i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]= temp;
                }
            }
        }
        
        System.out.println("The erise is: ");
         for(i=0; i<5; i++){
             System.out.println(arr[i]);
         }
    }
}
