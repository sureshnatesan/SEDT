package Week6;

import org.junit.Test;

public class DayProblem {

	/*
	 * 
	 * Pseudo code
	 * 1. get the year and subtract by 1 to get the odd days
	 * 2.check the give year is greather than 400, if yes use the % operation to get the odd number
	 * 3. create one variable to store the odd days
	 */
	@Test
	public void postive(){
		System.out.println(dayOfTheWeek(12,8,2023));
	}

	public String dayOfTheWeek(int day, int month, int year) {
		year=year-1;
		int days=0;
		month=month-1;
		int rem = year%400;
		if(rem>=100) {
			days=(rem/100)*5;
		}
		
		int rem1 =rem/4;
		days=days+(rem-rem1)+(rem1*2);
		days=days%7;
		if(month==1||month ==3||month==5||month ==7||month ==8||month ==10||month==12) {
			days=days+3;
		}
		else if (month !=2|| month !=0) {
			days=days+2;
		}
		days=days+day-1;
		if(month>2) {
			if(year+1%100==0) {
				if(year+1%400==0) {
					days=days+1;
				}
			}
			else {
				if(year+1%4==0) {
					days=days+1;
				}
			}
		}
		int daytype=days%7;
		if(daytype==0) {
			return "Sunday";
		}
		else if(daytype==1) {
			return "Monday";
		}
		else if(daytype==2) {
			return "Tuesday";
		}
		else if(daytype==3) {
			return "Wednesday";
		}
		else if(daytype==4) {
			return "Thursday";
		}
		else if(daytype==5) {
			return "Friday";
		}
		else  {
			return "Saturday";
		}
	}

}
