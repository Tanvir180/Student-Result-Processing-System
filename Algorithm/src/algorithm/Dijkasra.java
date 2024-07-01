
package algorithm;

import java.util.Scanner;

public class Dijkasra {
          
    private static void dijkstra(int[][]adjacencyMatrix)
    {
         int v= adjacencyMatrix.length;
        boolean visited[] = new boolean[v];            // Check that array is visited or not
        int distance[] = new int[v];                   // distance array
        distance[0] = 0;
        for(int i=1; i<v ;i++){
            distance[i] = Integer.MAX_VALUE;            // Initialy all the distance turns into infinity except for the first vertices
        }
        
        for(int i=0; i<v-1; i++){
            // Find Vertex with min distance
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            // Explore Neighbor 
            for (int j=0 ; j<v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && visited[j] == false  && distance[minVertex] != Integer.MAX_VALUE){
                int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];                
                if(newDist < distance[j]){                                             //Relaxation
                    distance[j] = newDist;
                }  
            }
            }
        }
        //Print
        for(int i=0; i<v; i++){
            System.out.println("Vertex= "+i+" distance "+distance[i]);
        }
        
    }
    
    
    private static int findMinVertex(int[]distance, boolean visited[]){
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for(int i=0; i<distance.length; i++ ){
            if(visited[i]==false && distance[i] < min){
                min= distance[i];
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
        dijkstra(adjMatrix);
         
         
     }
}
