package mandatoryHomeWork.DSA.week9;

public class leetcodeproblem {
	/*
	 * 
	 * 
	 * 
	 * 
	 */

	public String restoreString(String s, int[] indices) {
		char sum[] = new char[indices.length];
		for (int i=0;i<indices.length;i++){
			int a= indices[i];
			sum[a]=s.charAt(i);

		}
		String string = new String(sum);
		return string;
	}
}
