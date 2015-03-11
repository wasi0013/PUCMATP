package polymorphism;

public class Main {

	public static void main(String[] args) {
		Polymorphism objects = new Polymorphism();
		objects.method1();
		objects.method1(5);
		
		int number= 90;
		
		String x = "Number peyechi " + number;
		
		System.out.println("Ami "+x);
		System.out.println(number + number);
		//+ works both as addition and concatenation

	}

}
