
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tutorial wk2 Q3
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println(String.format("Current time is %d:%d:%d GMT", currentHour, currentMinutes, currentSecond));
		
	}

}
