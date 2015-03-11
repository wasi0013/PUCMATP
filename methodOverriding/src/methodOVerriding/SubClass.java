package methodOVerriding;

public class SubClass extends SuperClass{

@Override
	public void superMethod(){
		//super.superMethod() will call superMethod() of SuperClass
		super.superMethod();
		System.out.println("I am a method of Sub Class");
		
	}
	
}
