package mandatoryHomeWork.DSA.week10;


@FunctionalInterface
public interface Data1 {
	int a=5;
	
	void header(String s1);
	default void city() {
		System.out.println("hello");
	}
	static void country() {
		
	}
	
}
