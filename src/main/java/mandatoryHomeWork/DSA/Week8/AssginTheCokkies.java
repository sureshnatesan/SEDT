package mandatoryHomeWork.DSA.Week8;

import java.util.Arrays;

import org.junit.Test;

public class AssginTheCokkies {


	/*
	 * 
	 * Pseudo code
	 * 1. sort the both input
	 * 2.create a two for loop one for the cookies as the outer 
	 * and children as the inner for loop
	 * 3.create one int variable to store the count, if children greed equals/greater than need
	 * increase count +1 and make the cookies to 0;
	 * 
	 */

	@Test
	public void testData() {
		int[] g= {1,2,3};
		int[] s= {3};
		System.out.println(findContentChildren1(g,s));

	}
	public int findContentChildren(int[] ch, int[] coo) {
		int count =0;
		Arrays.sort(ch);
		Arrays.sort(coo);
		for(int i=0;i<coo.length;i++){
			for(int j=0;j<ch.length;j++){
				if(coo[i]==ch[j]&&ch[j]!=0){
					count++;
					ch[j]=0;
					coo[i]=0;
				}
			}
		}
		Arrays.sort(ch);
		Arrays.sort(coo);
		for(int i=0;i<coo.length;i++){
			for(int j=0;j<ch.length;j++){
				if(coo[i]>ch[j]&&ch[j]!=0){
					count++;
					ch[j]=0;
					coo[i]=0;
				}
			}
		}

		return count;
	}

	public int findContentChildren1(int[] ch, int[] coo) {
		int count =0;
		for(int i=0;i<coo.length;i++){
			for(int j=0;j<ch.length;j++){
				if(coo[i]==ch[j]&&ch[j]!=0){
					count++;
					ch[j]=0;
					coo[i]=0;
				}
			}
		}

		for(int i=0;i<coo.length;i++){
			for(int j=0;j<ch.length;j++){
				if(coo[i]>ch[j]&&ch[j]!=0){
					count++;
					ch[j]=0;
					coo[i]=0;
				}
			}
		}

		return count;
	}
}
