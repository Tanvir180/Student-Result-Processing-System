
package algorithm;

import static algorithm.DFS.node;
import java.util.*;

public class Prime {
    
     private static void prims(int[][]adjacencyMatrix){
        int v= adjacencyMatrix.length;
        boolean visited[] = new boolean[v];            
        int weight[] = new int[v];
        int parent[] = new int[v];
        
        
        for(int i=1; i<v; i++){
            weight[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        weight[0] = 0;              // Make weight 0 for the source vertices
        parent[0] = -1;             // First node is always root of mst
        
        for(int i=0; i<v-1; i++){
            // pick vertex with min weight
            int minVertex = findMinVertex(weight, visited);
            visited[minVertex] = true;
            // Explore it unvisited Neighbor 
            for (int j=0 ; j<v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && visited[j]==false ){
                    if(adjacencyMatrix[minVertex][j] < weight[j]){
                        weight[j] = adjacencyMatrix[minVertex][j];
                        parent[j]= minVertex;
                    }
                }
               
            }
            }
        
        //print edges of MST
         System.out.println("The Path of MST Will be:");
            for(int i=1; i<v; i++)
                {
                    System.out.println(parent[i]+ " "+ i+" "+weight[i]);
                }
            
        }
    
        private static int findMinVertex(int[] weight, boolean visited[]){
            int min = Integer.MAX_VALUE;
            int min_index = 0;
            for(int i=0; i<weight.length; i++){
                if(visited[i]==false && weight[i] < min){
                    min= weight[i];
                    min_index = i;
                }
            }
            return min_index;
        }
    
    
    
    public static void main(String[] args) {
                       
        int node, edge;
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number of Node:");
        node = input.nextInt();
        System.out.println("Enter the number of Edge:");
        edge = input.nextInt();
        int adjMatrix[][] = new int[node][node];
         System.out.println("Enter Source and destination and Weight:");
         
         for(int i=0; i<edge; i++){
            int u = input.nextInt();
            int v = input.nextInt();
            int weight = input.nextInt();
            
            adjMatrix[u][v] = weight;
            adjMatrix[v][u] = weight;
            
        }
        prims(adjMatrix);
         
         
     }

}