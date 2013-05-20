package com.pbrisson.misc.dijkstra;

public class Vertex implements Comparable<Vertex>{
	public String name;
	public Edge[] neighbours;
	public Vertex nextVertexToOrigin;
	public double minDistanceToOrigin = Double.POSITIVE_INFINITY;
	
	public Vertex(String name){
		this.name = name;
	}
	
	public String toString(){
		return name + " @"+minDistanceToOrigin;
	}
	@Override
	public int compareTo(Vertex o) {
		return Double.compare(minDistanceToOrigin, o.minDistanceToOrigin);
	}
	  
}
