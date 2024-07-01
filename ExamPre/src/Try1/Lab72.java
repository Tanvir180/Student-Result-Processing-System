package Try1;
import java.util.Scanner;
public class Lab72 {
   final int a=5;
    public static void main(String[] args) {
        //System.out.println(a);
       int a=6;
        System.out.println(a);
        Lab72 h = new Lab72();
        h.show();
    
    }
    public void show(){
        System.out.println(a);
    
}
    }


    

/*
    Scanner input = new Scanner(System.in);
        int []arr= new int[100];
        int i=0,x=6;
        while(arr[x]!=0){
             arr[x]=input.nextInt();
             x++;
        }
      for(i=0;i<=100;i++){
          if(arr[i]!=0){
              System.out.println("Fuck");
              arr[i]=input.nextInt();
          }
         // else if(arr[i]==0){
              //break;
          }
      }
       /* 
        int flag=0;
        if(arr[i]!=0){
            for(i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        flag++;
                    }
                }
                System.out.println("arr[i] occur "+flag+"times");
            }
            
        }
*/