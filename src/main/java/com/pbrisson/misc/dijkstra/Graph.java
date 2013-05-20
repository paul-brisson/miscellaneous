package com.pbrisson.misc.dijkstra;

import java.util.HashMap;

public class Graph {
	
	public static HashMap<String,Vertex> getSmallGraph(){
		
		HashMap<String,Vertex> graph = new HashMap<String,Vertex>();
		
		//put 4 vertices
		graph.put("A",new Vertex("A"));
		graph.put("B",new Vertex("B"));
		graph.put("C",new Vertex("C"));
		graph.put("D",new Vertex("D"));
		
		
		//build edges
		
		//Make bi-directional edges with different weights,
		//to test that shortest path in one direction 
		//may not be the shortest in reverse direction.
		
		//   
		//A  --10--> B
		//A <-- 4--  B
		//A  -- 5--> C
		//A <--20--  C	
		//B  -- 6--> C
		//B <-- 3--  C		
		//B  -- 2--> D
		//B <--20--  D
		//C  --20--> D
		//C <-- 5--  D	
		
		//A to D = A,C,B,D = 10
		//D to A = D,C,B,A = 12
		
		graph.get("A").neighbours = new Edge[]{
			new Edge(10,graph.get("B")),
			new Edge(5,graph.get("C"))
		};
		
		graph.get("B").neighbours = new Edge[]{
			new Edge(4,graph.get("A")),
			new Edge(6,graph.get("C")),
			new Edge(2,graph.get("D"))
		};
		
		graph.get("C").neighbours = new Edge[]{
			new Edge(20,graph.get("A")),
			new Edge(3,graph.get("B")),
			new Edge(20,graph.get("D"))
		};
		
		graph.get("D").neighbours = new Edge[]{
			new Edge(20,graph.get("B")),
			new Edge(5,graph.get("C"))
		};
		
		return graph;
	}
	
	public static HashMap<String,Vertex> getBigGraph(){
		
		HashMap<String,Vertex> graph = new HashMap<String,Vertex>();
		
		//put 4 vertices
		graph.put("A",new Vertex("A"));
		graph.put("B",new Vertex("B"));
		graph.put("C",new Vertex("C"));
		graph.put("D",new Vertex("D"));
		graph.put("E",new Vertex("E"));
		graph.put("F",new Vertex("F"));
		graph.put("G",new Vertex("G"));
		graph.put("H",new Vertex("H"));
		graph.put("I",new Vertex("I"));
		graph.put("J",new Vertex("J"));
		graph.put("K",new Vertex("K"));
		
		
		//build edges
		
		//Make bi-directional edges with different weights,
		//to test that shortest path in one direction 
		//may not be the shortest in reverse direction.
		
		//A to K = A,B,K = 
		//K to A = K,J,D,A = 
		//G to A = G,C,H,J,D,A = 
		
		graph.get("A").neighbours = new Edge[]{
			new Edge(25,graph.get("B")),
			new Edge(25,graph.get("C")),
			new Edge(25,graph.get("E"))
		};
		
		graph.get("B").neighbours = new Edge[]{
			new Edge(25,graph.get("A")),
			new Edge(25,graph.get("K"))
		};
		
		graph.get("C").neighbours = new Edge[]{
			new Edge(1000,graph.get("A")),
			new Edge(1000,graph.get("E")),
			new Edge(25,graph.get("G")),
			new Edge(25,graph.get("H"))
		};
		
		graph.get("D").neighbours = new Edge[]{
			new Edge(25,graph.get("H"))
		};
		
		graph.get("E").neighbours = new Edge[]{
			new Edge(25,graph.get("A")),
			new Edge(25,graph.get("C")),
			new Edge(1000,graph.get("J"))
		};
		
		graph.get("F").neighbours = new Edge[]{
			new Edge(25,graph.get("I"))
		};
		
		graph.get("G").neighbours = new Edge[]{
			new Edge(25,graph.get("C"))
		};
		
		graph.get("H").neighbours = new Edge[]{
			new Edge(25,graph.get("C")),
			new Edge(25,graph.get("D")),
			new Edge(25,graph.get("J"))
		};
		
		graph.get("I").neighbours = new Edge[]{
			new Edge(25,graph.get("J"))
		};
		
		graph.get("J").neighbours = new Edge[]{
			new Edge(25,graph.get("E")),
			new Edge(25,graph.get("H")),
			new Edge(25,graph.get("I")),
			new Edge(25,graph.get("K"))
		};
		
		graph.get("K").neighbours = new Edge[]{
			new Edge(1000,graph.get("B")),
			new Edge(25,graph.get("J"))
		};
		

		return graph;
	}

}
