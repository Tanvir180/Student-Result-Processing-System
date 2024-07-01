//MD.Tanvir Ahammed Hridoy
//ID: B-180305020
package Algorithm;

import java.util.*;


public class Dijkstra {
    
    private static void dijkstra(int[][]adjacencyMatrix){
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
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j]  && distance[minVertex] != Integer.MAX_VALUE){
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
        int minVertex = -1;
        for(int i=0; i<distance.length; i++ ){
            if(!visited[i]  && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
            
        return minVertex;
    }
    
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of vertices and edges: ");
        int v = input.nextInt();
        int e = input.nextInt();
        int adjacencyMatrix[][] = new int[v][v];
        for(int i=0; i<e; i++){
            int v1 = input.nextInt();
            int v2 = input.nextInt();
            int weight = input.nextInt();
            
            adjacencyMatrix[v1][v2] = weight;
            adjacencyMatrix[v2][v1] = weight;
            
        }
        dijkstra(adjacencyMatrix);

}
    
}



 