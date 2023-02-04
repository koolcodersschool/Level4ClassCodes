package day7;

public class DaysOfWeek {
	
	public static void main(String[] args) {
		String weekday = getWeekDayBasedOnNumber(7);
		System.out.println(weekday);
		
	}
	
	
	public static String getWeekDayBasedOnNumber(int day) {
		if(day > 7 || day < 1) {
			throw new IllegalArgumentException("invalid day: " + day);
		}
		
		String weekDay = "";
		switch(day) {
		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		}
		
		return weekDay;
		
	}

}
