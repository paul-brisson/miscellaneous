package com.pbrisson.misc.dijkstra;

public class Edge{
	 
	//an edge points to a target and has a weight
	public double weight;
	public Vertex target;
	
	public Edge(double weight, Vertex target){
		this.weight = weight;
		this.target = target;
	}
	  
	  
}
