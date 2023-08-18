package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

public class PalindromeNumber {
	/*
	1.Understood the question
	2. ip-->int, op-->boolean
	3. Pseudo code

	i.use the modular operator to get the reminder
	ii. create a one more variable and store the variable
	iii.compare new variable with input, if same return true


	 */

	@Test
	public void postiveTest1(){
		soluction(10);
	}


	public boolean soluction (int a){
		int s=a;

		int sum=0;

		while(a>0){
			int rem= a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		System.out.println(sum);
		if(sum-s==0){
			return true;
		}
		else{
			return false;
		}
	}


}
