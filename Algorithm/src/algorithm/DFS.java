
package algorithm;
import java.util.*;
public class DFS {
    
    static int node, edge;
    static int White = 1; 
    static int Gray = 2; 
    static int Black = 3; 
    static int []color = new int[100];
    static int adjMatrix[][] = new int[100][100];
    
    //Count discovery and finising time
    static int Time =1;
    static int[] stime =new int[100];
    static int[] ftime =new int[100];
    
    
     private static void dfsVisit(int x)
    {
        color[x]=Gray;
        //Work = 
        stime[x] = Time;
        Time++;
       
        for(int i=0; i<node;i++){
              if(adjMatrix[x][i]==1)
              {
                  if(color[i]==White)
                  {
                      dfsVisit(i);
                  }
              }
        
        }
         color[x]=Black;
        
        ftime[x] = Time;
        Time++;
    }
     private static void dfs()
    {
                
        for(int i=0;i<node;i++)
        {
            color[i] = White;
        }
        for(int i=0;i<node;i++)
        {
            if(color[i]==White)
           {
               dfsVisit(i);
           }
        }
        //dfsVisit(2);
    }
       
     public static void main(String[] args) {
                
     
       
    
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number of Node:");
        node = input.nextInt();
        System.out.println("Enter the number of Edge:");
        edge = input.nextInt();
       
         System.out.println("Enter Source and destination:");
         
         for(int i=0; i<edge; i++)
         {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
             adjMatrix[n1][n2]=1;
             //adjMatrix[n2][n1]=1;
         }
         dfs();
         for(int i=0;i<node;i++)
         {
             System.out.println("Starting time and Finishing Time of "+i+" is: "+stime[i]+" & "+ftime[i]);
         }
     }
}
