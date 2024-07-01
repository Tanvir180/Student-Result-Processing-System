//MD. Tanvir Ahammed Hridoy
//ID:B180305020
package graph;

import java.util.*;
public class BFSGraph {

    private final LinkedList<Integer> adj[];     //array of link list
 
    public BFSGraph(int v){           //constructor 
        adj = new LinkedList[v];       //adj linklist initialize
        for(int i=0;i<v;i++){
            adj[i]= new LinkedList<>();   //put vertices into the adj linked list
        }
    }
    
    
    public void addEdge(int source, int destination){         //take source and des and create edge between them
        adj[source].add(destination);
        adj[destination].add(source);
    }
    
    
    
    
	public int bfs(int source, int destination) {
		
		boolean vis[] = new boolean[adj.length];            //visited bollean array which length is as adj ,,,,first it is false
		int parent[] = new int[adj.length];                 //parent array, which say that whose parent is who
		Queue<Integer> q = new LinkedList<>();              //initialige  Queue
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;                                  // mark source is true that means it is visited
		
		while(!q.isEmpty()) {
			int cur = q.poll();                          //get first element of Queue 
			if(cur == destination){
                            break;
                        }
			for(int neighbor: adj[cur]) {                 //current vertices er sob neighbor have to visit from adj list
				if(!vis[neighbor]) {
					vis[neighbor] = true;         // mark neighbor is true that means it is visited
					q.add(neighbor);              //if neighbor is not visited put it into Queue
					parent[neighbor] = cur;
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		
		
		while(parent[cur] != -1) {                       // let source is -1 ,so when we found source the loop is exit
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		
		return distance;
	}
    
    
    
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges:");
        
        int v = input.nextInt();                   
        int e = input.nextInt();
        
        BFSGraph graph =new BFSGraph(v);          //create  bfsgraph obj
        
        System.out.println("Enter "+e+" edges :");
        for(int i=0;i<e;i++){                        
            int source = input.nextInt();
            int destination = input.nextInt();
            
            graph.addEdge(source, destination);           //Give each source and dis to addEdge
        }
            System.out.println("Enter source and destination");
		
		int source = input.nextInt();
		int destination = input.nextInt();      //give the source where the traversal will start and give des where it will stop
		
		int distance = graph.bfs(source, destination); //call bfs 
		System.out.println("min distance is " + distance);
        }
    }
    

