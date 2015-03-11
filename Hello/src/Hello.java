
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		//java 1.7 test this won't work on 1.6 or older
		String key = "One";
		switch (key){
		case "One": System.out.println("The value is one");
		break;
		
		default : System.out.println("The value is Not One");
		
	}

}
}
