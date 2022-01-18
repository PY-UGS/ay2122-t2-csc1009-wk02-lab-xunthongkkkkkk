import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tutorial wk2 Q2

		Scanner input = new Scanner(System.in);
		
		double [] numbers = new double [3];
	
		double total = 0;
		
		System.out.println("Enter three numbers: ");
		
		for (int i = 0; i < 3; i++) {			
			double number = input.nextDouble();
			numbers[i] = number;
			total += number;
		}
		
		double average = total / 3;
		
		System.out.println(String.format("The average of %.1f %.1f %.1f is %.1f", numbers[0], numbers[1], numbers[2], average));
		
		
	}

}
