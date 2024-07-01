
package algorithm;
import java.util.*;
public class BFS {
        
        static int node,edge;
        static int White = 1; 
        static int Gray = 2; 
        static int Black = 3; 
        static int[][] adjMatrix = new int[100][100];
        static int [] color= new int[100];
        static int [] parent= new int[100];
        static int [] dis= new int[100];
        
        private static void bfs(int startingNode)
        {
            int v = 0;
            for(int i=0;i<node;i++)
            {
             color[i]= White;
             dis[i]= -3344;
             parent[i]= -1;
            }
            dis[startingNode]=0;
            parent[startingNode]=-1;
            
            //Queue Implementation
            Queue<Integer> q = new LinkedList<>();              //initialige  Queue
	    q.add(startingNode);
            
            while(!q.isEmpty())
            {
                int x = q.poll(); 
              //  v = x;
              if(color[x]==White){
                  System.out.println(x);
              }
                color[x]= Gray;
                
                //Work
                for(int i=0;i<node;i++)
                {
                    if(adjMatrix[x][i]==1)
                    {
                        if(color[i]==White)
                        {
                            //X er neigobour i
                            // tahole x hocce i er parent
                            dis[i]= dis[x]+1;
                            parent[i]=x;
                            q.add(i);
                        }
                    }
                }
                
            }
         //   System.out.println(v+1);
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
             adjMatrix[n2][n1]=1;
         }
         bfs(0);
           // System.out.println(parent[7]);
           //System.out.println(dis[7]);
    }
        
}
