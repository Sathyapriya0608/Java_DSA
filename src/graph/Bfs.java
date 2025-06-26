package graph;

import java.util.Queue;
import java.util.ArrayDeque;

public class Bfs {
	static int[][] adjacencyMatrix;
	static int vertices;
	Bfs(int vertices){
		Bfs.adjacencyMatrix=new int[vertices][vertices];
		Bfs.vertices=vertices;
	}
	public static void addEdge(int src,int dest) {
		adjacencyMatrix[src][dest]=1;
//		adjacencyMatrix[dest][src]=1;
		
	}
	public static void Bfs (int start) {
		boolean[] visited=new boolean[vertices];//t f f t f
		Queue<Integer>data=new ArrayDeque<Integer>();
		visited[start]=true;
		data.add(start);
		System.out.print("bfs: ");
	    while(!data.isEmpty()){
	    	int current=data.poll();
	    	System.out.print(current+ " ");
	    	for(int i=0;i<vertices;i++) {
	    		if(adjacencyMatrix[current][i]==1 && !visited[i]) {
	    			visited[i]=true;
	    			data.add(i);
	    		}
	    	}
	    }
			System.out.println();
			System.out.println();
	}
	public static void display()
	{
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(adjacencyMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[]args) {
		Bfs  a=new Bfs(5);// row and column
		
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,3);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(1,0);
		addEdge(1,4);
		Bfs(0);
		a.display();
		
		
		
	}

}
