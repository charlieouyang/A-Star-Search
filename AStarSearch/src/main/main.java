package main;

import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;

public class main {

	/**
	 * @param args
	 */
	static ArrayList<ArrayList<Square>> maze = new ArrayList<ArrayList<Square>>();
	//static int startXCoordinate = 2;
	//static int startYCoordinate = 13;
	
	//First goal
	//static int endXCoordinate = 23;
	//static int endYCoordinate = 5;
	
	//Second goal
	//static int endXCoordinate = 2;
	//static int endYCoordinate = 3;
	
	//Third goal
	static int startXCoordinate = 0;
	static int startYCoordinate = 0;
	static int endXCoordinate = 24;
	static int endYCoordinate = 24;

	//Depth First Search
	static ArrayList<Square> depthClosedList = new ArrayList<Square>();
	static Stack<Square> depthOpenStack = new Stack<Square>();
	
	//Bread First Search
	static ArrayList<Square> breadthClosedList = new ArrayList<Square>();
	static Queue<Square> breadthOpenQueue = new LinkedList<Square>();
	
	//A Star Search
	static ArrayList<Square> aStarClosedList = new ArrayList<Square>();
	static ArrayList<Square> aStarOpenList = new ArrayList<Square>();
	static ArrayList<Square> aStarTempClosedList = new ArrayList<Square>();
	static ArrayList<Square> aStarTempOpenList = new ArrayList<Square>();
	
	public static void main(String[] args) throws FileNotFoundException {
		//Read in the maze
		ReadInMaze();
		
		//Apply search algorithm
		//DepthFirstSearch();
		//BreadthFirstSearch();
		AStarSearch();
	}
	
	public static void AStarSearch(){
		Square startingSquare = maze.get(startYCoordinate).get(startXCoordinate);
		Square endingSquare = maze.get(endYCoordinate).get(endXCoordinate);
		
		//Encode the distances to the squares
		//Start from the end point
		int distance = 0;
		Square parentSquare = maze.get(endingSquare.getYCoordinate()).get(endingSquare.getXCoordinate());
		parentSquare.setStepValue(distance);
		parentSquare.setVisited();
		
		//Call recursive function here
		AddNeighboursMethodRepo.addAStarNeighboursDistance(parentSquare, maze);
		for (ArrayList<Square> yRow : maze){
			for (Square xSquare : yRow){
				xSquare.resetAfterDistanceCalculation();
			}
		}
		
		boolean done = false;
		boolean firstMove = true;
		// Get children for the first square
		// Edge case starting square == ending square
		if (startXCoordinate == endXCoordinate && startYCoordinate == endYCoordinate) {
			return;
		}

		if (firstMove) {
			firstMove = false;
			Square mazeSquare = maze.get(startingSquare.getYCoordinate()).get(startingSquare.getXCoordinate());
			mazeSquare.setVisited();
			aStarOpenList.add(AddNeighboursMethodRepo.getCheapestNeighbour(mazeSquare, maze));
		}
		
		for (ArrayList<Square> yRow : maze){
			for (Square square: yRow){
				if (!square.getStepValueSet()) {
					System.out.print("X ");
				}
				else if (square.getStepValueSet()){
					System.out.print(square.getStepValue() + " ");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
		
		//Evaluate all children to calculate cost
			//Visit the cheapest. If not goal, generate more children
		int iterationNumber = 0;
		while (!done){	
			if (aStarOpenList.size() == 0){
				continue;
			}
			
			Square exploreThisSquare = aStarOpenList.get(aStarOpenList.size() - 1);
			aStarOpenList.remove(exploreThisSquare);
			
			Square mazeSquare = maze.get(exploreThisSquare.getYCoordinate()).get(exploreThisSquare.getXCoordinate());
			if (mazeSquare.getVisited()){
				continue;
			}
			mazeSquare.setVisited();
			aStarClosedList.add(exploreThisSquare);
			
			if (exploreThisSquare.getXCoordinate() == endingSquare.getXCoordinate() && exploreThisSquare.getYCoordinate() == endingSquare.getYCoordinate()){
				//we're done
				done = true;
				System.out.println("We're finished the maze");
			}
			else{
				aStarOpenList.add(AddNeighboursMethodRepo.getCheapestNeighbour(mazeSquare, maze));
			}			
			
			System.out.println(iterationNumber);
			PrintOutMaze();
			System.out.println();
			iterationNumber++;
		}

		// Print out path
		int costOfPath = 0;
		System.out.println("Printing out the path to reach the goal A star");
		for (Square square : aStarClosedList) {
			System.out.print("[" + square.getXCoordinate() + ","
					+ square.getYCoordinate() + "] ");
			costOfPath++;
		}
		System.out.println("Cost of path: " + costOfPath);
		System.out.println("It visited " + aStarClosedList.size() + " nodes");
	}
	
	public static void BreadthFirstSearch(){
		Square startingSquare = maze.get(startXCoordinate).get(startYCoordinate);
		Square endingSquare = maze.get(endYCoordinate).get(endXCoordinate);
		boolean done = false;
		boolean firstMove = true;

		// Edge case starting square == ending square
		if (startXCoordinate == endXCoordinate && startYCoordinate == endYCoordinate) {
			return;
		}

		if (firstMove) {
			firstMove = false;
			Square mazeSquare = maze.get(startingSquare.getYCoordinate()).get(startingSquare.getXCoordinate());
			mazeSquare.setVisited();
			breadthOpenQueue = AddNeighboursMethodRepo.addBreadthNeighbours(startingSquare, maze, breadthOpenQueue);
			breadthClosedList.add(startingSquare);
		}
		
		int iterationNumber = 0;
		while (!done){
			if (breadthOpenQueue.size() == 0){
				//We finished...
				System.out.println("we're done?");
			}
			
			//Evaluate the open stack
			//Take one square, if not goal then compute more neighbor squares
			Square exploreThisSquare = breadthOpenQueue.remove();
			
			Square mazeSquare = maze.get(exploreThisSquare.getYCoordinate()).get(exploreThisSquare.getXCoordinate());
			if (mazeSquare.getVisited()){
				continue;
			}
			mazeSquare.setVisited();
			breadthClosedList.add(exploreThisSquare);
			
			if (exploreThisSquare.getXCoordinate() == endingSquare.getXCoordinate() && exploreThisSquare.getYCoordinate() == endingSquare.getYCoordinate()){
				//we're done
				done = true;
				System.out.println("We're finished the maze");
			}
			else{
				breadthOpenQueue = AddNeighboursMethodRepo.addBreadthNeighbours(exploreThisSquare, maze, breadthOpenQueue);
			}		
			
			System.out.println(iterationNumber);
			PrintOutMaze();
			System.out.println();
			iterationNumber++;
		}
		
		//Print out path
		int costOfPath = 0;
		System.out.println("Printing out the path to reach the goal");
		for (Square square : breadthClosedList){
			System.out.print("[" + square.getXCoordinate() + "," + square.getYCoordinate() + "] ");
			if (costOfPath%40 == 0){
				System.out.print("\n");
			}
			costOfPath++;
		}
		System.out.println("\nCost of path: " + costOfPath);
		System.out.println("It visited " + breadthClosedList.size() + " nodes");
	}
	
	public static void DepthFirstSearch(){
		Square startingSquare = maze.get(startXCoordinate).get(startYCoordinate);
		Square endingSquare = maze.get(endYCoordinate).get(endXCoordinate);
		boolean done = false;
		boolean firstMove = true;
		
		//Edge case starting square == ending square
		if (startXCoordinate == endXCoordinate && startYCoordinate == endYCoordinate){
			return;
		}
		
		if (firstMove){
			firstMove = false;
			Square mazeSquare = maze.get(startingSquare.getYCoordinate()).get(startingSquare.getXCoordinate());
			mazeSquare.setVisited();
			depthOpenStack = AddNeighboursMethodRepo.addDepthNeighbours(startingSquare, maze, depthOpenStack);
			depthClosedList.add(startingSquare);
		}
		
		int iterationNumber = 0;
		while (!done){						
			if (depthOpenStack.size() == 0){
				//We finished...
				System.out.println("we're done?");
			}
			
			//Evaluate the open stack
			//Take one square, if not goal then compute more neighbor squares
			Square exploreThisSquare = depthOpenStack.pop();
			Square mazeSquare = maze.get(exploreThisSquare.getYCoordinate()).get(exploreThisSquare.getXCoordinate());
			mazeSquare.setVisited();
			depthClosedList.add(exploreThisSquare);
			
			if (exploreThisSquare.getXCoordinate() == endingSquare.getXCoordinate() && exploreThisSquare.getYCoordinate() == endingSquare.getYCoordinate()){
				//we're done
				done = true;
				System.out.println("We're finished the maze");
			}
			else{
				depthOpenStack = AddNeighboursMethodRepo.addDepthNeighbours(exploreThisSquare, maze, depthOpenStack);
			}
			
			System.out.println(iterationNumber);
			PrintOutMaze();
			System.out.println();
			iterationNumber++;
		}

		// Print out path
		int costOfPath = 0;
		System.out.println("Printing out the path to reach the goal");
		for (Square square : depthClosedList) {
			System.out.print("[" + square.getXCoordinate() + ","
					+ square.getYCoordinate() + "] ");
			costOfPath++;
		}
		System.out.println("\nCost of path: " + costOfPath);
		System.out.println("It visited " + depthClosedList.size() + " nodes");
	}
	
	public static void PrintOutMaze(){
		for (ArrayList<Square> yRow : maze){
			for (Square square: yRow){
				if (!square.getOpen()) {
					System.out.print("6");
				}
				else if (square.getVisited() == false){
					System.out.print("0");
				}
				else{
					System.out.print("1");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void ReadInMaze() throws FileNotFoundException{
		String fileName = "input//maze.txt";
		FileReader fileReader = new FileReader(fileName);
		Scanner readFile = new Scanner(fileReader);
		
		int xCoord = 0;
		int yCoord = 0;
		
		while (readFile.hasNextLine()){
			String line = readFile.nextLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			
			ArrayList<Square> temp = new ArrayList<Square>();
			
			while (st.hasMoreTokens()){
				String token = st.nextToken();
				int openInt = Integer.parseInt(token);
				boolean open = true;
				if (openInt == 1){
					open = false;
				}
				
				Square square = new Square(xCoord, yCoord, open);
				temp.add(square);
				xCoord++;
			}
			maze.add(temp);
			xCoord = 0;
			yCoord++;
		}
	}

}
