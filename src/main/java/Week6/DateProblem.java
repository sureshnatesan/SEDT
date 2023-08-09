package Week6;

import org.junit.Test;

public class DateProblem {
	
	 /*
	  * 
	  * https://leetcode.com/problems/day-of-the-year/
    Pseudo code
    1. split the string using "-" and convert them into the int
    2. check the year is leep year or not using % operation.
    3. get the month value and product them to get the day
    4. for feb & Aug make them -2, +1 respectively.
    5. create a for loop to check given month is even  or odd

    */
	
	@Test
	public void testData(){
		System.out.println(dayOfYear("2008-10-10"));
		//31+29+31+30+31+30+31+31+30+10;
	}
	
	
    public int dayOfYear(String date) {
        
       String[] dates=date.split("-");
       int year = Integer.parseInt(dates[0]);
        int months = Integer.parseInt(dates[1]);
        int day= Integer.parseInt(dates[2]);
       int days=0;
       if((year%4)==0&&months>2){
           days++;
       }
       if(((months)-1)>0){
           for(int i=1;i<months;i++){
               if(i==2){
                   days=days+28;
               }
               else if(i==8||i==1||i==3||i==5||i==7||i==10||i==12){
                   days=days+31;
               }
              
               else {
                   days=days+30;
               }
               System.out.println(i  + " "+days);
           }
       }
       return days+day;
    }


}
