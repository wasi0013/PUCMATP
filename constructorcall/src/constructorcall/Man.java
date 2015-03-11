package constructorcall;

public class Man {
	public String name;
	
	public void getName(String name){
		System.out.println("My name is "+name);
		
	}
	
	public Man(String name){
		
		this.name = name;
		System.out.println(name);
	
	}

}
