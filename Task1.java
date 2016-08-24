//Test
public class Task1 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) //chooses values from 1 to 10 for i
		{
			for(int j=1;j<=i;j++) //chooses values from 1 to i for j
			{
				System.out.print("*");// prints * for number of j
			}
			System.out.println();//prints each line of j
		}
	}
}
