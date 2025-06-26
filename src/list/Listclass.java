package list;
import java.util.List;
import java.util.*;
public class Listclass {
	 static List <List<Integer>> li=new ArrayList<>();
	
	public Listclass(int vertices) {
		for(int i=0;i<vertices;i++) {
			li.add(new ArrayList<Integer>());
		}
	}
	public static void addEdge(int src,int dist) {
		li.get(src).add(dist);
		li.get(dist).add(src);
	}
	public static void display() {
		for(int i=0;i<li.get(i).size();i++) {
			System.out.print(i+" ");
			for(int j=0;j<li.get(i).size();j++) {
				System.out.print(li.get(i).get(j)+" ");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		Listclass pa= new Listclass(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,3);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(1,4);
		addEdge(2,3);
		addEdge(3,4);
		addEdge(4,1);
		display();
		
	}

}
