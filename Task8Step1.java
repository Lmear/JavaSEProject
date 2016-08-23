import java.util.*;

public class Task8Step1 {
	
	String size [][]; // Instance Variable
	String length [][]; // Instance Variable
	
	/// Create Board Class
	
	class board{
		public board(String boardSize[][]){ // Class constructor
			size = boardSize; 
		}
	}
	
	// Create Ship class
	
	class ship{
		public ship(String shipSize[][]){ // Class constructor
			length = shipSize;
		}
	}
	
	public static void main(String[] args) {
		board gameBoard = new board [3][3];
		
		System.out.println("Welcome to Battleships");

	}
}