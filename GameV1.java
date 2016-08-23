import java.util.*;

public class GameV1{//Class
	
	public static void main(String[] args) {//Main
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Please enter the board size you would like to play on.");
		int size = input.nextInt();
		
		System.out.println("Welcome to Battleships you are playing on a " + size + "X"+ size + " board\n");
		
		char[][] player1Board = new char[size+1][size+1];
		char[][] player2Board = new char[size+1][size+1];
		
		System.out.println("Player Board");
		BoardV1 board1 = new BoardV1(player1Board);
		board1.printBoard(player1Board);
		
		System.out.println();
		System.out.println("Opponent Board");
		BoardV1 board2 = new BoardV1(player2Board);
		board2.printBoard(player2Board);
		
		System.out.println();
	
			boolean worked = false;
			
			start:
				while(!worked){
					System.out.println("In which row would you like to place your ship of size 2?");
					int cell1 = input.nextInt();
					System.out.println("In Which column would you like to place your ship?");
					int cell2 = input.nextInt();System.out.println("Which direction would you like the ship to face, Horizontal or Vertical?\nEnter 1 or 2.");
					int dir = input.nextInt();
					worked = true;
					if(player1Board[cell1][cell2]=='B'){
						System.out.println("Not a valid selection");
						continue start;
					}
					else if(player1Board[cell1+1][cell2]=='B'){
						System.out.println("Not a valid selection");
						continue start;
					}
					else if(player1Board[cell1][cell2+1]=='B'){
						System.out.println("Not a valid selection");
						continue start;
					}
					else{
						player1Board[cell1][cell2]='B';
						if (dir==1){
							player1Board[cell1][cell2+1]='B';
						}
						else if (dir==2){
							player1Board[cell1+1][cell2]='B';
						}
						System.out.println("Player Board");
						board1.printBoard(player1Board);
						System.out.println();
						System.out.println("Opponent Board");
						board2.printBoard(player2Board);
						System.out.println();
					}
				
					
				boolean worked2 = false;
					start2:
						while(!worked2){
							System.out.println("In which row would you like to place your ship of size 3?");
							int cell3 = input.nextInt();
							System.out.println("In Which column would you like to place your ship?");
							int cell4 = input.nextInt();System.out.println("Which direction would you like the ship to face, Horizontal or Vertical?\nEnter 1 or 2.");
							int dir1 = input.nextInt();
							if(player1Board[cell3][cell4]=='B'){
								System.out.println("Not a valid selection1");
								continue start2;
							}
							else if(dir1==1){
								if(player1Board[cell3+1][cell4]=='B'){
									System.out.println("Not a valid selection2");
									continue start2;
								}
							else if(player1Board[cell3+2][cell4]=='B'){
									System.out.println("Not a valid selection3");
									continue start2;
								}
							}
							else if(dir1==2){
								if(player1Board[cell3][cell4+1]=='B'){
									System.out.println("Not a valid selection");
									continue start2;
								}
								else if(player1Board[cell3][cell4+2]=='B'){
									System.out.println("Not a valid selection");
									continue start2;
								}
							else{
								player1Board[cell3][cell4]='B';
								}
							if (dir1==1){
								player1Board[cell3][cell4+1]='B';
								player1Board[cell3][cell4+2]='B';
							}
							else if (dir1==2){
								player1Board[cell3+1][cell4]='B';
								player1Board[cell3+2][cell4]='B';
							}
							worked2 = true;
							System.out.println("Player Board");
							board1.printBoard(player1Board);
							System.out.println();
							System.out.println("Opponent Board");
							board2.printBoard(player2Board);
							System.out.println();
							
							boolean worked3 = false;
							start3:
								while(!worked3){
									System.out.println("In which row would you like to place your ship of size 4?");
									int cell5 = input.nextInt();
									System.out.println("In Which column would you like to place your ship?");
									int cell6 = input.nextInt();System.out.println("Which direction would you like the ship to face, Horizontal or Vertical?\nEnter 1 or 2.");
									int dir2 = input.nextInt();
									if(player1Board[cell5][cell6]=='B'){
										System.out.println("Not a valid selection1");
										continue start3;
									}
									else if(dir2==1){
										if(player1Board[cell5+1][cell6]=='B'){
											System.out.println("Not a valid selection2");
											continue start3;
										}
										else if(player1Board[cell5+2][cell6]=='B'){
											System.out.println("Not a valid selection3");
											continue start3;
										}
										else if(player1Board[cell5+3][cell6]=='B'){
											System.out.println("Not a valid selection3");
											continue start3;
										}
									}
									else if(dir2==2){
										if(player1Board[cell5][cell6+1]=='B'){
											System.out.println("Not a valid selection");
											continue start3;
										}
										else if(player1Board[cell5][cell6+2]=='B'){
											System.out.println("Not a valid selection");
											continue start3;
										}
										else if(player1Board[cell5][cell6+3]=='B'){
											System.out.println("Not a valid selection");
											continue start3;
										}
										else{
											player1Board[cell5][cell6]='B';
										if (dir2==1){
											player1Board[cell5][cell6+1]='B';
											player1Board[cell5][cell6+2]='B';
											player1Board[cell5][cell6+3]='B';
										}
										else if (dir2==2){
											player1Board[cell5+1][cell6]='B';
											player1Board[cell5+2][cell6]='B';
											player1Board[cell5+3][cell6]='B';
										}
										System.out.println("Player Board");
										board1.printBoard(player1Board);
										System.out.println();
										System.out.println("Opponent Board");
										board2.printBoard(player2Board);
										System.out.println();
										}
									}
								}
							}
						}
				}
	}
}