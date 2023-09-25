package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class KBeautyNumber {

	/*
	 * 
	 * 
	 * Pseudo code
	 * 1.use the % moduler operator based on the k value
	 * 2. use the while condition to get the % value
	 * 3. 
	 */

	@Test
	public void testData(){
		System.out.println(divisorSubstrings1(430043,2));
	}
	
	public int divisorSubstrings1(int num, int k) {
		String valueOf = String.valueOf(num);
		int left=0;
		int right=k;
		int count=0;
		
		while(left<=valueOf.length()-k) {
			String a=valueOf.substring(left, left+k);
			int b = Integer.parseInt(a);
			if(b!=0&&num%b==0) {
					count++;
			}
			//right=left+k;
			left++;
		}
		return count;
	}
	public int divisorSubstrings(int num, int k) {
		int sum =1;
		int num1=num;
		int count =0;
		while(k>0) {
			sum*=10;
			k--;
		}
		while(num>0) {
			int a=num%sum;
			if(num1==sum) {
				count++;
				num=0;
			}
			else if(a==0) {
				if(num1%sum==0) {
					count++;
				}
				
			}
			else if(num1%a==0){
				count++;
			}
			num=num/sum;
		}
		return count;
	}
}
