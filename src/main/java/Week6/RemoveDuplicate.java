package Week6;

import org.junit.Test;

public class RemoveDuplicate {
/*	

ip--> int[]
op-->int[]
Pseudo code 

1. create a for loop to iterate upto length -1;
2. create one variable to store the duplicate count and replace duplicate with -1
3.create one more int [] with length of length-count and non-1 value into the new array and return the same


*/
	@Test
	public void Postive() {
		int[] d=	soluction(new int[] {1, 2, 2, 3, 3, 4});
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

	public int[] soluction(int[] s) {
		int count=0;
		int sum[]=new int[s.length];
		for (int i=0;i<s.length-1;i++){
			if(s[i]!=s[i+1]){
				sum[count++]=s[i];
			}
			
		}
		if(s[s.length-1]!=s[s.length-2]) {
			sum[count++]=s[s.length-1];
			
		}
		
		/*count=0;
		for (int i = 0; i < sum.length; i++) {
			if(s[i]>=0) {
				sum[count]=s[i];
				count++;
			}
		}*/
		
		return sum;
	}

}
