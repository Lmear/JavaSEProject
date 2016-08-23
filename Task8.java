import java.util.*;

public class Task8{

    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int[][] ships = new int[3][2];
        int[] shoot = new int [2];
        int attempts = 0,
        		shotHit=0;
        
        initBoard(board);
        initShips(ships);
        
        System.out.println();
        
        do{
        	showBoard(board);
        	shoot(shoot);
        	attempts++;
        	
        	//if(hit(shoot,ships)1){
        	//	shotHit++;
        	//}
        	shotHit+=changeboard(shoot,ships,board);
        	
        }
        while (shotHit!=3);
        
        System.out.println("\n\n Battleships Java game finished! You hit 3 ships in " + attempts + " attempts");
        showBoard(board);
        }
    
    public static void initBoard(int[][] board){
    	for(int row = 0; row < 3; row ++)
    		for(int column = 0; column < 3; column++)
    			board[row][column]=-1;
    }
    
    public static void showBoard(int[][] board){
    	System.out.println("\t1 \t2 \t3");
    	System.out.println();
    	
    	for(int row = 0 ; row < 3 ; row++){
    		System.out.print((row+1)+ "");
    		for (int column = 0; column < 3; column ++){
    			if(board[row][column]==-1){
    				System.out.print("\t"+"~");
    			}
    			else if (board [row][column]==0){
    				System.out.print("\t"+"*");
    			}
    			else if (board[row][column]==1){
    				System.out.print("\t"+"#");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public static void initShips(int[][]ships){
    	Random random = new Random();
    	
    	for (int ship = 0; ship <2; ship++){
    		ships[ship][0]=random.nextInt(3);
    		ships[ship][1]=random.nextInt(3);
    		
    		for(int last=0; last < ship; last ++){
    			if( (ships[ship][0] == ships [last][0]) && (ships[ship][1]) == ships[last][1])
    			do {
    				ships[ship][0]=random.nextInt(3);
    				ships[ship][1]=random.nextInt(3);
    			}
    			while ( (ships[ship][0] == ships[last][0]) && (ships[ship][0] == ships[last][1]));
    		}
    	}
    }
    
    public static void shoot(int[] shoot){
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Row: ");
    	shoot[0] = input.nextInt();
    	shoot[0]--;
    	
    	System.out.print("Column: ");
    	shoot[1] = input.nextInt();
    	shoot[1]--;
    }
    
    public static boolean hit(int[] shoot, int[][] ships){
    	
    	for(int ship=0 ; ship<ships.length ; ship++){
    		if(shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
    			System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int changeboard(int[] shoot, int[][] ships, int[][] board){
    	if(hit(shoot,ships)) {
    		board[shoot[0]][shoot[1]]=1;
    		return 1;    	
    	}	else {
    		board[shoot[0]][shoot[1]]=0;
    		return 0;
    	}
    }
}        