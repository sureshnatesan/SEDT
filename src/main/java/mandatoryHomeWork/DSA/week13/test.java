package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class test {

	@Test
	public void testData(){
		System.out.println(solution(4,10));
	}

	public int solution(int N, int K) {
		// Implement your solution here
		int left =1;
		int right=N;
		int sum=0;
		if(K<=N){
			return 1;
		}
		
		//1 2 3 4
		while(right>0){
			sum+=right--;
			if(sum>=K){
				return N-right;
			}

		}
		return -1;
	}

}
