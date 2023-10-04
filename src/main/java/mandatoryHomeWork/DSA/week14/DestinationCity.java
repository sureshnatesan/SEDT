package mandatoryHomeWork.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DestinationCity {


	@Test
	public void testData(){
		List<List<String>> operations = Arrays.asList(
				Arrays.asList("pYyNGfBYbm", "wxAscRuzOl"),
				Arrays.asList("kzwEQHfwce","pYyNGfBYbm"));


		System.out.println(destCity(operations));
	}

	public String destCity(List<List<String>> paths) {
		Map<String,Integer> map= new HashMap<>();
		List<String> list = new ArrayList<>();
		for(List<String> routs:paths){
			list.add(routs.get(0));
			list.add(routs.get(1));
			map.put(routs.get(0),map.getOrDefault(routs.get(0), 0)+1);
			map.put(routs.get(1),map.getOrDefault(routs.get(1), 0)+1);
		}
		for(int i=list.size()-1;i>=1;i-=2){
			if(map.get(list.get(i))==1){
				return list.get(i);
			}
		}

		return "true";
	}



	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

		int sum[]= new int[2];
		int[] count= new int[aliceSizes.length+bobSizes.length];
		int avg=0;
		for (int i =0;i<aliceSizes.length;i++){
			count[i]=aliceSizes[i];
			avg+=aliceSizes[i];

		}
		for(int j=aliceSizes.length;j<aliceSizes.length+bobSizes.length;j++){
			count[j]=bobSizes[j-aliceSizes.length];
			avg+=bobSizes[j-aliceSizes.length];
		}
		int left =0;
		int right =1;
		while(left<count.length-1){
			if(right<count.length  && count[left]+count[right]==avg/2){
				sum[0]=count[left];
				sum[1]=count[right];
				return sum;
			}

			if(right==count.length){
				left++;
				right=left+1;
			}
			right++;
		}
	}   

}


}
