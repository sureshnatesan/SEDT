package mandatoryHomeWork.DSA.week14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FairCandySwap {

	@Test
	public void testdata(){
		int[] a= {1,1};
		int[] b= {2,2};
System.out.println(Arrays.toString(fairCandySwap(a,b)));
	}
	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		/*int sum1=0;
		int sum2=0;
		for(int i=0;i<aliceSizes.length;i++) {
			sum1+=aliceSizes[i];
		}
		for(int i=0;i<bobSizes.length;i++) {
			sum2+=bobSizes[i];
		}
		int avg = (sum1+sum2)/2;
		
		System.out.println(sum1);
		System.out.println(sum2);
		return new int[] {avg-sum1,avg-sum2};

*/
		
		int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            sum2+=bobSizes[i];
        }
        int mid = ( sum1 - sum2 ) / 2;
        Set<Integer> s2 = new HashSet<>();

        for(int i=0;i<bobSizes.length;i++){
            s2.add(bobSizes[i]);
        }

        for(int v : aliceSizes){
            if( s2.contains(v-mid)){
                return new int[] {v,v-mid};
            }
        }
        return new int[] {0,0};
        
	} 

}
