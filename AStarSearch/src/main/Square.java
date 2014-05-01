package main;

public class Square {
	private int xCoordinate;
	private int yCoordinate;
	private boolean open;
	private boolean visited;
	private boolean alreadyInOpenList;
	
	private boolean setStepValue;
	private int stepValue;
	
	public Square(int x, int y, boolean open){
		xCoordinate = x;
		yCoordinate = y;
		this.open = open;
		visited = false;
		alreadyInOpenList = false;
		setStepValue = false;
		stepValue = 9999;
	}
	public void setStepValue(int value){
		setStepValue = true;
		stepValue = value;
	}
	
	public int getStepValue(){
		return stepValue;
	}
	
	public boolean getStepValueSet(){
		return setStepValue;
	}
	
	public boolean getAlreadyInOpenList(){
		return alreadyInOpenList;
	}
	
	public void setAlreadyInOpenList(){
		alreadyInOpenList = true;
	}
	
	public int getXCoordinate(){
		return xCoordinate;
	}
	
	public int getYCoordinate(){
		return yCoordinate;
	}
	
	public boolean getOpen(){
		return open;
	}
	
	public void setVisited(){
		visited = true;
	}
	
	public void resetAfterDistanceCalculation(){
		visited = false;
		alreadyInOpenList = false;
	}
	
	public boolean getVisited(){
		return visited;
	}
}
