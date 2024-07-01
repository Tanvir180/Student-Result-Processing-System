//MD.Tanvir Ahammed Hridoy
//ID: B-180305020

package Prim;

import java.util.*;
 
public class prims {
    private static void prims(int[][]adjacencyMatrix){
        int v= adjacencyMatrix.length;
        boolean visited[] = new boolean[v];            
        int weight[] = new int[v];
        int parent[] = new int[v];
        weight[0] = 0;
        parent[0] = -1;
        
        for(int i=1; i<v; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        
        
        for(int i=0; i<v; i++){
            // pick vertex with min weight
            int minVertex = findMinVertex(weight, visited);
            visited[minVertex] = true;
            // Explore it unvisited Neighbor 
            for (int j=0 ; j<v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] ){
                    if(adjacencyMatrix[minVertex][j] < weight[j]){
                        weight[j] = adjacencyMatrix[minVertex][j];
                        parent[j]= minVertex;
                    }
                }
               
            }
            }
        
        //print edges of MST
         System.out.println("The Path of MST Will be:");
            for(int i=1; i<v; i++){
                if(parent[i] < i){
                    System.out.println(parent[i]+ " "+ i+" "+weight[i]);
                }
            }
        }
    
        private static int findMinVertex(int[] weight, boolean visited[]){
            int minVertex = -1;
            for(int i=0; i<weight.length; i++){
                if(!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])){
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
        prims(adjacencyMatrix);

    }

    }

