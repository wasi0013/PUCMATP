package customexceptionexample;

public class Main {

	public static void main(String[] args) {
		try{
			compute(8);
			//outputs: Normal Exit..
			
			//this will throw GreaterThanTenException
			compute(12);
			
		}
		catch(Exception e){
			
			System.out.println("Caught Exception: " + e);
			
		}
	}
	
	public static void compute(int value) throws GreaterThanTenException{
		
		if(value > 10){
			throw new GreaterThanTenException("Value is greater than ten!");
		}
		else{
			
			System.out.println("Normal Exit...");
			
		}
		
		
	}

}
