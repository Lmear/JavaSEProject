
public class BoardV1 { //Class

	public char[][] player1Board = new char[0][0]; //Instance of class"Object"


	public BoardV1(char [][] playerBoard){
		/*for (int r =0 ; r<playerBoard.length; r++){
			for (int c=0; c<1; c++){
				playerBoard[r][c]='A';	
			}
		}*/
		for (int r =0 ; r<playerBoard.length; r++){
			for (int c=0; c<playerBoard.length; c++){
				playerBoard[r][c]='~';	
			}
		}
	}

	
	public void printBoard(char [][] playerBoard){
		System.out.println("  \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \t10");
		for (int r=1; r<playerBoard.length; r++){
			System.out.print(r+" ");
			for (int c=1 ; c<playerBoard[0].length; c++){
				
				System.out.print("\t"+playerBoard[r][c]);
				}
			System.out.println(" ");
		}
	}

}