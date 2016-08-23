import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		System.out.println("How many lines of dots?");// questions how many line
		Scanner user_input = new Scanner(System.in);//user input creation
		int input = user_input.nextInt();//user input
		for(int line = 1; line<=input; line++){//lines to run
			for(int dots = 1; dots <= line; dots++){//dots in line
				System.out.print("*");//prints * j times
				user_input.close();
			}
		System.out.println(); //prints i lines with j dots
		}
	}

}