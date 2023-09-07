package mandatoryHomeWork.DSA.week10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class IncreasingDecreasingString {

	@Test
	public void testData(){
		System.out.println(sortString("aaaabbbbcccc"));
	}
	
	  public String sortString(String s) {
		  String sum="";
		  
		  for (int i = 0; i < s.length(); i++) {

sum=sum+s.charAt(i);
s=s.replaceAll(s.charAt(i)+"", "");
			
		}
		  System.out.println(sum);
		  /* 
		  String sum=s;
		  String value="";
		  char[] charArray = sum.toCharArray();
		  Arrays.sort(charArray);
		  for (int i = 0; i < charArray.length; i++) {
			  char a=charArray[i];
			  if(a<charArray[i]) {
				  value=value+a;
			  }
			
		}
	        
		  Map<Character,Integer> map= new HashMap<>();
		  
		  for (int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			System.out.println(map);
		}*/
		  
		  return "";
	    }
}
