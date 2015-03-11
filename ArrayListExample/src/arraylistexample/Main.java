
package arraylistexample;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		//ArrayList with types (only contains String)
		ArrayList <String> al = new ArrayList<String>();
		
		//Declaration without types 
		//ArrayList  alternate = new ArrayList();
		
		System.out.println("Initial Size: "+al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("New Size: "+al.size());
		System.out.println("Contents: "+al);
		
		al.add(2,"B2");
		System.out.println("contents: "+al);
		
		al.remove("B2");
		al.add("C");
		
		System.out.println("Contents after removal: "+al);
		
		//removes only the first appearance of the item from the list
		al.remove("C");
		System.out.println("Contents after removal without knowing index: "+al);
		
		

	}


}
