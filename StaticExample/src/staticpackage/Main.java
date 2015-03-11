package staticpackage;

public class Main {

	public static void main(String[] args) {
		
		NewClass ob1 = new NewClass();
		NewClass ob2 = new NewClass();
		ob1.x++;
		ob2.x++;
		ob1.y++;
		ob2.y++;
		
		System.out.println("Ob1.x is : "+ob1.x);
		System.out.println("ob2.x is : "+ob2.x);
		System.out.println("ob1.y is : "+ob1.y);
		System.out.println("ob2.y is : "+ob2.y);
	
	}

}
