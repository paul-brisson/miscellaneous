package com.pbrisson.misc.dijkstra;

import java.util.List;



public class Dijkstra {
	
	public static void main(String args[]){
		
		small("A", "D");
		small("D", "A");
		small("B", "C");
		small("C", "B");
		
		//A to K = A,B,K = 50
		//K to A = K,J,E,A = 75
		//G to A = G,C,H,J,E,A = 125
		big("A","K");
		big("K","A");
		big("G","A");

		
		
	}
	
	
	private static void small(String a, String b){
		System.out.println("-----"+a+" to "+b);
		List<Vertex> shortestPath = DijkstraAlgorithm.getShortestPath(Graph.getSmallGraph(), a, b);
		for(Vertex ver : shortestPath){
			System.out.println(ver);
		}
	}
	
	private static void big(String a, String b){
		System.out.println("-----"+a+" to "+b);
		List<Vertex> shortestPath = DijkstraAlgorithm.getShortestPath(Graph.getBigGraph(), a, b);
		for(Vertex ver : shortestPath){
			System.out.println(ver);
		}
	}
	
}
