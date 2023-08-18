package mandatoryHomeWork.Foundation.Problem1;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FizzBuzzProblem {



	@Test
	public void testName()  {
		//Soluction(3);
		System.out.println(Soluction(3));
		System.out.println(Soluction(5));
		System.out.println(Soluction(-1));
	}
	

	public List<String> Soluction(int a) {
		List<String> sum = new LinkedList<>();
		if(a>0) {


			for (int i = 1; i <=a; i++) {
				if((i%3) == 0 &&(i%5) == 0  ) {
					sum.add("FizzBuzz");
				}
				else if (i%3==0) {
					sum.add("Fizz");
				}
				else if (i%5==0) {
					sum.add("Buzz");
				}
				else {
					String valueOf = String.valueOf(i);
					sum.add(valueOf);
				}
			}

			return sum;
		}
		
		else {
			String d= " Give a valid value ";
			sum.add(d);
			return sum;
		}
	}



	/*
	 * 1. create a for loop for the iteration with the specific input number
	 * 2. create a if, else statement to check the reminder of the i value 
	 * 3. create a array list to store the value
	 * 4. after all iternation completed , return that particular list 
	 */

}
