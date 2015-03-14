package customexceptionexample;

@SuppressWarnings("serial")
public class GreaterThanTenException extends Exception{
	//Custom Exception class
	public String str;
	
	public GreaterThanTenException(String str){
		
		//initializes global str by concatenating local str
		this.str = "GreaterThanTenException: ".concat(str);
	}
	@Override
	public String toString(){
		return str;
	}

}
