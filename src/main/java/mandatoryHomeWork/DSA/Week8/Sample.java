package mandatoryHomeWork.DSA.Week8;

public class Sample {

	public static void main(String[] args) {
		String s= "My name is suresh";
		String value="";
		String [] names=s.split(" ");
		for (int i = 0; i < names.length; i++) {
			char a=Character.toUpperCase(names[i].charAt(0));
			
			names[i]=names[i].replaceFirst(names[i].charAt(0)+"", a+"");
			value=value+" "+names[i];
		}
		
		System.out.println(value);
	}

}
