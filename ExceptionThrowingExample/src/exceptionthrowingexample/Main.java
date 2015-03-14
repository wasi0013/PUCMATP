package exceptionthrowingexample;

public class Main {

	public static void main(String[] args) {
		
		try{
			compute(8);
		    compute(0);
		}
		catch(Exception e){
			
			System.out.println("Caught Exception: " + e);
		}

	}
	
	public static void compute(int num) throws ArithmeticException {
		//throws Arithmetic Exception
		
		if (num == 0){
			throw new ArithmeticException("Divide by Zero Error!");
		}
		else{
			int value = 10/num;
			System.out.println("Value: " + value);
		}
	}
	
//	public static void compute(int num) throws ArithmeticException{
		
//		//java will automatically throw ArithmeticException
//		int value = 10/num;
//		
//		System.out.println("Value: " + value );
//		
//		
//	}

}
