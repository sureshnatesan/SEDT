package mandatoryHomeWork.DSA.week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class BribeLine {
	
	/*
	 * 
	 * https://www.hackerrank.com/challenges/new-year-chaos/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
	 * 
	 * Pseudo code
	 * 1. create a for loop to iterate for the given list size
	 * 2. i>i+1 increase the count
	 */
	@Test
	public void testData(){
		List list=new ArrayList<Integer>();
		//5 1 2 3 7 8 6 4
		/*list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(6);
		list.add(4);*/
		//2 5 1 3 4->too 
		list.add(2);
		
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		minimumBribes(list);
		
	}
	
	 public static void minimumBribes1(List<Integer> q) {
		 for(int i=q.size()-1;i>=0;i--) {
			 
		 }
	 }
		 
		 
			
			
	 public static void minimumBribes(List<Integer> q) {

		 List<Integer> queue = new ArrayList<>();
			for(int i=1;i<=q.size();i++) {
				queue.add(i);
			}
		Collections.sort(queue);
		for(int a=1;a<=q.size();a++) {	
		}				
		 int count=0;
         for(int i=q.size()-1;i>=0;i--) {
        	
             for(int j=i-1;j>=0;j--) {
                 if(q.get(i)<q.get(j)) {
                     count++;
                 }
             }  
             System.out.println(count);
             //1 2 5 3 4 7 8 6->count
         }
         /*
         if(sum>=2) {
             System.out.println("Too chaotic");
         }
         
         else{
        	 
              System.out.println(count);
         }*/
    }
	 

}
