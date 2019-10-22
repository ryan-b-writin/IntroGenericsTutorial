package tutorial;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb;
		
		iOb = new Gen<Integer>(90);
		
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value: " + v );
		
		System.out.println();
		
		Gen<String> sOb = new Gen<String>("testing");
		
		sOb.showType();
		
		String str = sOb.getob();
		System.out.println("value: " + str);

	}

}
