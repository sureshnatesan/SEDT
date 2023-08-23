package mandatoryHomeWork.DSA.Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Arraysproblems {
	
	@Test
	public void soluction() {
		int [] a= {7,8,6,6};
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		}
		  /*int[] primaryArray = {1,2,3};
	        int[] secondaryArray = primaryArray;
	        secondaryArray[2] = 5;
	        System.out.println(Arrays.toString(primaryArray));
	        System.out.println(Arrays.toString(secondaryArray));
	   */
	        int[] primaryArray1 = new int[]{1,2,3};
	        int[] secondaryArray1 = primaryArray1;
	        secondaryArray1[2] = 5;
	        System.out.println(Arrays.toString(primaryArray1));
	        System.out.println(Arrays.toString(secondaryArray1));
	        Arrays.fill(a, 10);

	        
	        
	        Object[][] employee=new Object[3][2];
	        employee[0][0]="Aswini";
	        employee[0][1]=28;
	        employee[1][0]="Ravi";
	        employee[1][1]=29;
	        employee[1][0]="abi";
	        employee[1][1]=32;
	        
	       // Employee df= new Employee[2]();
	        Employee[] emp=new Employee[5];
	        emp[0]=new Employee("John",30);
	        emp[1]=new Employee("Tom",31);
	        emp[2]=new Employee("sam",32);
	        emp[3]=new Employee("Pam",33);
	        emp[4]=new Employee("Kenny",34);
	        
	        for (Employee each:emp) {
	            System.out.println(each.getName());
	        }
	        
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        System.out.println(numbers.get(2));
	       
	}

}
