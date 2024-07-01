
package algorithm;
import java.util.*;

public class Graph1 {
    
    
    public static void main(String[] args) {
                
        
        Scanner input = new Scanner(System.in);
        int node, edge;
        System.out.println("Enter the number of Node:");
        node = input.nextInt();
        System.out.println("Enter the number of Edge:");
        edge = input.nextInt();
        int adjMatrix[][] = new int[node][node];
         System.out.println("Enter Source and destination:");
         
         for(int i=0; i<edge; i++)
         {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
             adjMatrix[n1][n2]=1;
            // adjMatrix[n2][n1]=1;
         }
         
         for(int i=0; i<node;i++){
              for(int j=0; j<node;j++){
                  System.out.print(adjMatrix[i][j]+"\t");
              }
              System.out.println("");
         }
        
    }
    
}
