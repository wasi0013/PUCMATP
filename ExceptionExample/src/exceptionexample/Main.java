package exceptionexample;

public class Main {

	public static void main(String[] args) {
		
		try{
			//raises Arithmetic Exception
			int a = 5/0;
			
			//this won't execute
			
			System.out.println("This won't print: "+a);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Catched Exception: "+e);
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("This will always get executed");
			
		}
		System.out.println("After try-catch block");
		
	}

}
