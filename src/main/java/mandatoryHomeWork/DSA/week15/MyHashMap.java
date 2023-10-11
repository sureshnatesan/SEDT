package mandatoryHomeWork.DSA.week15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;

public class MyHashMap {
	int[] sum;

	public MyHashMap() {
		sum = new int[Integer.MAX_VALUE];
		Arrays.fill(sum, Integer.MAX_VALUE);
	}

	public void put(int key, int value) {
		sum[key]=value;
      //  int h;
       // sum[key]=value;
      /*if(key ==(Integer) null) h=0;
      else{
    	  h = (Integer)key.hashCode() ^ (h >>> 16);
      }
		
	*/	
	}

	public int get(int key) {

		return sum[key];
	}

	public void remove(int key) {
		sum[key]=Integer.MAX_VALUE;
	}
	
	@Test
	public void testData(){
		MyHashMap obj= new MyHashMap();
		
	}
}
