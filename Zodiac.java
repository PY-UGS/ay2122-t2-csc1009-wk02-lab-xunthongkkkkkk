import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tutorial wk2 Q3
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		int number = year % 12;
		
		String zodiac = "";
		
		switch (number) {
			case 0:
				zodiac = "monkey";
				break;
			case 1:
				zodiac = "rooster";
				break;
			case 2:
				zodiac = "dog";
				break;
			case 3:
				zodiac = "pig";
				break;
			case 4:
				zodiac = "rat";
				break;
			case 5:
				zodiac = "ox";
				break;
			case 6:
				zodiac = "tiger";
				break;
			case 7:
				zodiac = "rabbit";
				break;
			case 8:
				zodiac = "dragon";
				break;
			case 9:
				zodiac = "snake";
				break;
			case 10:
				zodiac = "horse";
				break;
			case 11:
				zodiac = "sheep";
				break;
			default:
				zodiac = "";
				break;
		}
		System.out.println(zodiac);
	}

}
