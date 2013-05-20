package com.pbrisson.misc.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;


public class DijkstraAlgorithm {
	  
	public static List<Vertex> getShortestPath(HashMap<String,Vertex> graph, String originName, String destinationName){
		
		List<Vertex> shortestPath = new ArrayList<Vertex>();
		
		Vertex origin = graph.get(originName);
		
		
		origin.minDistanceToOrigin = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(origin);
		
		//compute shortest distances for all nodes.
		while(!queue.isEmpty()){
			
			Vertex fromNode = queue.poll();
			
			for(Edge neighbour: fromNode.neighbours){
				
				Vertex toNode = neighbour.target;
				double totalWeight = fromNode.minDistanceToOrigin + neighbour.weight;

				if(totalWeight < toNode.minDistanceToOrigin){
					queue.remove(toNode);
					toNode.minDistanceToOrigin = totalWeight;
					neighbour.target.nextVertexToOrigin = fromNode;
					queue.add(toNode);
				}
			}
		}
		
		//build shortest path list beginning from destination
		Vertex destination = graph.get(destinationName);
		while(destination.nextVertexToOrigin != null){
			shortestPath.add(destination);
			destination = destination.nextVertexToOrigin;
		}
		shortestPath.add(origin);
		Collections.reverse(shortestPath);
		return shortestPath;
	}
}
