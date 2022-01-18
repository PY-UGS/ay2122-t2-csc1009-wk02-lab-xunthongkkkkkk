import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tutorial wk2 Q1
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		
		System.out.println(String.format("The area for the circle of radius is %.1f is %f", radius, area));
	}

}
