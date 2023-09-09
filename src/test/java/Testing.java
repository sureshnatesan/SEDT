
public class Testing {
	
	
	public static  String soluction(String s) {
		
		String sum="";
		/*
		 * My name is Test
yM eman si tseT
		 */
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1; j >=0; j--) {
				sum=sum+split[i].charAt(j);
			}
			sum=sum+" ";
		}

		return sum.trim();
	}

	public static void main(String[] args) {

System.out.println(soluction("My name is Test"));

	}

}
