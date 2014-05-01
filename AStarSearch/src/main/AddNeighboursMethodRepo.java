package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddNeighboursMethodRepo {

	/**
	 * @param args
	 */
	public static Stack<Square> addDepthNeighbours(Square square, ArrayList<ArrayList<Square>> maze, Stack<Square> openStack){
		if (square.getXCoordinate() == 0 && square.getYCoordinate() == 0){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openStack.push(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() == 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 0){
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() != 24 && square.getYCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openStack.push(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 24 && square.getYCoordinate() == 24 && square.getXCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
			if (!neighbour1.getVisited()  && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openStack.push(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited()  && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() != 0 && square.getYCoordinate() != 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openStack.push(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 0 && square.getYCoordinate() == 0 && square.getXCoordinate() != 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}		
		else{
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openStack.push(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openStack.push(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openStack.push(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openStack.push(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		
		return openStack;
	}
	
	public static Queue<Square> addBreadthNeighbours(Square square, ArrayList<ArrayList<Square>> maze, Queue<Square> openQueue){
		if (square.getXCoordinate() == 0 && square.getYCoordinate() == 0){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openQueue.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() == 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 0){
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() != 24 && square.getYCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openQueue.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 24 && square.getYCoordinate() == 24 && square.getXCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openQueue.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() != 0 && square.getYCoordinate() != 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openQueue.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 0 && square.getYCoordinate() == 0 && square.getXCoordinate() != 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else{
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openQueue.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openQueue.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openQueue.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openQueue.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		
		return openQueue;
	}
	
	public static ArrayList<Square> addAStarNeighbours(Square square, ArrayList<ArrayList<Square>> maze, ArrayList<Square> openList){
		if (square.getXCoordinate() == 0 && square.getYCoordinate() == 0){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openList.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() == 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 0){
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() != 24 && square.getYCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openList.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 24 && square.getYCoordinate() == 24 && square.getXCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openList.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() != 0 && square.getYCoordinate() != 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openList.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
		}
		else if (square.getXCoordinate() != 0 && square.getYCoordinate() == 0 && square.getXCoordinate() != 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		else{
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (!neighbour1.getVisited() && neighbour1.getOpen() && !neighbour1.getAlreadyInOpenList()){
				openList.add(neighbour1);
				neighbour1.setAlreadyInOpenList();
			}
			if (!neighbour2.getVisited() && neighbour2.getOpen() && !neighbour2.getAlreadyInOpenList()){
				openList.add(neighbour2);
				neighbour2.setAlreadyInOpenList();
			}
			if (!neighbour3.getVisited() && neighbour3.getOpen() && !neighbour3.getAlreadyInOpenList()){
				openList.add(neighbour3);
				neighbour3.setAlreadyInOpenList();
			}
			if (!neighbour4.getVisited() && neighbour4.getOpen() && !neighbour4.getAlreadyInOpenList()){
				openList.add(neighbour4);
				neighbour4.setAlreadyInOpenList();
			}
		}
		
		return openList;
	}
	
	public static Square getCheapestNeighbour(Square square, ArrayList<ArrayList<Square>> maze){
		if (square.getXCoordinate() == 0 && square.getYCoordinate() == 0){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (neighbour2.getStepValue() <= neighbour3.getStepValue() && neighbour2.getStepValueSet()){
				return neighbour2;
			}
			else{
				return neighbour3;
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour1.getStepValue() <= neighbour4.getStepValue() && neighbour1.getStepValueSet()){
				return neighbour1;
			}
			else{
				return neighbour4;
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() == 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			if (neighbour2.getStepValue() <= neighbour3.getStepValue() && neighbour2.getStepValueSet()){
				return neighbour2;
			}
			else{
				return neighbour3;
			}
		}
		
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() == 0){
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour4.getStepValue() <= neighbour3.getStepValue() && neighbour4.getStepValueSet()){
				return neighbour4;
			}
			else{
				return neighbour3;
			}
		}
		else if (square.getXCoordinate() == 24 && square.getYCoordinate() != 24 && square.getYCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour1.getStepValue() <= neighbour3.getStepValue() && neighbour1.getStepValue() <= neighbour4.getStepValue() && neighbour1.getStepValueSet()){
				return neighbour1;
			}
			else if (neighbour3.getStepValue() <= neighbour1.getStepValue() && neighbour3.getStepValue() <= neighbour4.getStepValue() && neighbour3.getStepValueSet()){
				return neighbour3;
			}
			else{
				return neighbour4;
			}
		}
		else if (square.getXCoordinate() != 24 && square.getYCoordinate() == 24 && square.getXCoordinate() != 0){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour1.getStepValue() <= neighbour2.getStepValue() && neighbour1.getStepValue() <= neighbour4.getStepValue() && neighbour1.getStepValueSet()){
				return neighbour1;
			}
			else if (neighbour2.getStepValue() <= neighbour1.getStepValue() && neighbour2.getStepValue() <= neighbour4.getStepValue() && neighbour2.getStepValueSet()){
				return neighbour2;
			}
			else{
				return neighbour4;
			}
		}
		else if (square.getXCoordinate() == 0 && square.getYCoordinate() != 0 && square.getYCoordinate() != 24){
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			if (neighbour1.getStepValue() <= neighbour2.getStepValue() && neighbour1.getStepValue() <= neighbour3.getStepValue() && neighbour1.getStepValueSet()){
				return neighbour1;
			}
			else if (neighbour2.getStepValue() <= neighbour1.getStepValue() && neighbour2.getStepValue() <= neighbour3.getStepValue() && neighbour2.getStepValueSet()){
				return neighbour2;
			}
			else{
				return neighbour3;
			}
		}
		else if (square.getXCoordinate() != 0 && square.getYCoordinate() == 0 && square.getXCoordinate() != 24){
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour4.getStepValue() <= neighbour2.getStepValue() && neighbour4.getStepValue() <= neighbour3.getStepValue() && neighbour4.getStepValueSet()){
				return neighbour4;
			}
			else if (neighbour2.getStepValue() <= neighbour4.getStepValue() && neighbour2.getStepValue() <= neighbour3.getStepValue() && neighbour2.getStepValueSet()){
				return neighbour2;
			}
			else{
				return neighbour3;
			}
		}
		else{
			Square neighbour1 = maze.get(square.getYCoordinate()-1).get(square.getXCoordinate());
			Square neighbour2 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()+1);
			Square neighbour3 = maze.get(square.getYCoordinate()+1).get(square.getXCoordinate());
			Square neighbour4 = maze.get(square.getYCoordinate()).get(square.getXCoordinate()-1);
			if (neighbour4.getStepValue() <= neighbour2.getStepValue()
					&& neighbour4.getStepValue() <= neighbour3.getStepValue()
					&& neighbour4.getStepValue() <= neighbour1.getStepValue()
					 && neighbour4.getStepValueSet()) {
				return neighbour4;
			}
			else if (neighbour3.getStepValue() <= neighbour4.getStepValue()
					&& neighbour3.getStepValue() <= neighbour2.getStepValue()
					&& neighbour3.getStepValue() <= neighbour1.getStepValue()
					 && neighbour3.getStepValueSet()) {
				return neighbour3;
			} else if (neighbour2.getStepValue() <= neighbour4.getStepValue()
					&& neighbour2.getStepValue() <= neighbour3.getStepValue()
					&& neighbour2.getStepValue() <= neighbour1.getStepValue()
					 && neighbour2.getStepValueSet()) {
				return neighbour2;
			} else {
				return neighbour1;
			}
		}
	}
	
	public static void addAStarNeighboursDistance(Square parentSquare, ArrayList<ArrayList<Square>> maze){
		int parentDistance = parentSquare.getStepValue();
		int childDistance = parentDistance + 1;
		
		ArrayList<Square> childrenOfParentSquare = new ArrayList<Square>();
		childrenOfParentSquare = addAStarNeighbours(parentSquare, maze, childrenOfParentSquare);
		for (Square child : childrenOfParentSquare){
			if (child.getStepValueSet()){
				continue;
			}
			child.setStepValue(childDistance);
			child.setVisited();
		}
		addAStarNeighboursDistanceRecursive(childrenOfParentSquare, maze, childDistance);
	}
	
	public static void addAStarNeighboursDistanceRecursive(ArrayList<Square> parentSquareList, ArrayList<ArrayList<Square>> maze, int parentDistance){
		int childDistance = parentDistance + 1;
		
		ArrayList<Square> tempChildrenOfParentSquare = new ArrayList<Square>();
		for (Square parentSquare : parentSquareList){
			ArrayList<Square> tempList = new ArrayList<Square>();
			tempList = addAStarNeighbours(parentSquare, maze, tempList);
			
			for (Square tempSquare : tempList){
				tempChildrenOfParentSquare.add(tempSquare);
			}
		}
		
		if (tempChildrenOfParentSquare.size() == 0){
			return;
		}

		for (Square child : tempChildrenOfParentSquare){
			if (child.getStepValueSet()){
				continue;
			}
			child.setStepValue(childDistance);
			child.setVisited();
			
		}
		
		addAStarNeighboursDistanceRecursive(tempChildrenOfParentSquare, maze, childDistance);
	}
}
