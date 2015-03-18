package seventhquestion;

public class Main {

	public static void main(String[] args) {
		
		int [] x = new int[5];
		
		try{
			//this will throw ArrrayIndexOutOfBounds exception and program will terminate
			//after executing finally block 
			x[5]=14;
			System.out.println("won't output anything");
			
		}
		catch(ArithmeticException e){
			
			System.out.println("Yeah, AE! occured");
		}
		finally{
			//this will be the output
			System.out.println("Done here");
		}
		System.out.println("Finished");

	}

}
