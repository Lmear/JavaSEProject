import java.util.*;

public class Task5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the area to be painted in m^2");
		double area = input.nextDouble();
		System.out.println(area + "m^2");
		
		double paint1area = area/(20*10);
		double paint2area = area/(15*11);
		double paint3area = area/(10*20);
		
		int paint1tins = (int)Math.ceil(paint1area);
		int paint2tins = (int)Math.ceil(paint2area);
		int paint3tins = (int)Math.ceil(paint3area);
		
		double paint1waste = (paint1tins-paint1area)*20;
		double paint2waste = (paint2tins-paint2area)*15;
		double paint3waste = (paint3tins-paint3area)*10;	
		
		double paint1cost = (paint1tins)*19.99;
		double paint2cost = (paint2tins)*17.99;
		double paint3cost = (paint3tins)*25.00;
		
		if (paint1waste <= paint2waste && paint1waste <= paint3waste){
			System.out.println("Using Cheapomax results in least waste of " + paint1waste + "litres");
			}
		if (paint2waste <= paint1waste && paint2waste <= paint3waste){
			System.out.println("Using Averagejoes results in least waste of " + paint2waste + "litres");
			}
		if (paint3waste <= paint1waste && paint3waste <= paint2waste){
			System.out.println("Using Duluxorous results in least waste of " + paint3waste + "litres");
			}
		if (paint1cost <= paint2cost && paint1cost <= paint3cost){
			System.out.println("Using Cheapomax results in the lowest cost of £" + paint1cost);
			}
		if (paint2cost <= paint1cost && paint2cost <= paint3cost){
			System.out.println("Using AverageJoes results in the lowest cost of £" + paint2cost);
			}
		if (paint3cost <= paint1cost && paint3cost <= paint2cost){
			System.out.println("Using Duluxourous results in the lowest cost of £" + paint3cost);
			}
		input.close();
	}
}