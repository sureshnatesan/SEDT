package mandatoryHomeWork.DSA.week10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data1 s= new Data1() {
			
			@Override
			public void header(String s1) {
				// TODO Auto-generated method stub
				System.out.println(s1);
			}
		};
		//s.header("hello");
		
		
		Data1 sq=(name)->{
			System.out.println(name);
		};
		
		sq.header("Google");
		Function<String,Integer> fun1=a->a.length();
		System.out.println(fun1.apply("hellow"));
		
		List<String> a = new ArrayList<>();
		a.add("Gold");
		a.add("silver");
		a.add("Dimond");
		a.replaceAll(a1 ->a1+  " is Metal");
		System.out.println(a);
	}

}
