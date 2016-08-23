import java.io.*;
public class Task4 {
	public static void main(String[] args) {
		String input="";//String created by user
		System.out.println("Enter the object to be reversed.");//String request
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();//reads string
			char[]try1 = input.toCharArray();//finds string length
			for(int i=try1.length-1;i>=0;i--)//counts down from string length to 0
				System.out.print(try1[i]);//prints char from position in string
		}
		catch(IOException e){
			e.printStackTrace();//prints reversed string
		}
	}
}