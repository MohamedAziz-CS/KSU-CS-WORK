import java.util.Scanner;

public class TimeCompare {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);	
	
		System.out.print("Enter the units (hr_min, day_hr, sec_millisec): ");
		String type = in.next().toLowerCase();
		
		switch (type) {
	
		case "hr_min":
			
			System.out.print("Enter two numbers: ");
			double hr=in.nextDouble();
			double min = in.nextDouble();
			
			double hrToMin = hr*60;
			double minToHr = min/60;
			if (hrToMin>min) {
				System.out.println(hr + " hours is greater than " + minToHr + " hours" );
			} else if (hrToMin<min) {
				System.out.println(min + " minutes is greater than " + hrToMin + " minutes");
			} else {
				System.out.println(hr + " hours is equal to " + min + " minutes");
			}
			break;
			
		case "day_hr":
			
			System.out.print("Enter two numbers: ");
			double day=in.nextDouble();
			double hr1 = in.nextDouble();
			
			double dayToHr = day*24;
			double hrToDay = hr1/24;
			if (dayToHr>hr1) {
				System.out.println(day + " days is greater than " + hrToDay + " days" );
			} else if (dayToHr<hr1) {
				System.out.println(hr1 + " hours is greater than " + dayToHr + " hours");
			} else {
				System.out.println(day + " days is equal to " + hr1 + " hours");
			}
			break;	
		
		case "sec_millisec":
			
			System.out.print("Enter two numbers: ");
			double sec=in.nextDouble();
			double milli = in.nextDouble();
			
			double secToMilli = sec*1000;
			double milliToSec = milli/1000;
			if (secToMilli>milli) {
				System.out.println(sec + " seconds is greater than " + milliToSec + " seconds" );
			} else if (secToMilli<milli) {
				System.out.println(milli + " milliseconds is greater than " + secToMilli + " milliseconds");
			} else {
				System.out.println(sec + " seconds is equal to " + milli + " milliseconds");
			}
			break;	
		
		default:
			
			System.out.println("Invalid operation");
			
			break;
		
		}
		
	in.close();
	
	}

}
