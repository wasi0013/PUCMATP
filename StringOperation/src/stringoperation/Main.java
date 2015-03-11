package stringoperation;

public class Main {

	public static void main(String[] args) {
		
		String x = "Premier University";
		String ob = new String("Premier University");
		System.out.println(x);
		System.out.println(ob);
		System.out.println(x.equals(ob));
		System.out.println(x.equalsIgnoreCase(ob));
		//returns 0 for equal positive for large and negative for less
		
		//substring methods
		String str = "Premier University";
		String sub = str.substring(8);
		//P r e m i e r   U n i  v  e  r  s i t y
		//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		//sub2 contains 8->13
		String sub2 = str.substring(8,14);
		System.out.println(sub+"  "+sub2);

		//compare methods
		System.out.println(x.compareTo(ob));
		
		//for matching substring use regionMatches() method
		
		//checks x with str both are Premier University
		System.out.println(x.regionMatches(0,str,0,5));
		
		//checks x with sub neglecting cases
		System.out.println(x.regionMatches(true,0,sub,0,2));
		
		//class codes
		String ab="venue_premier";
		String ac = "Venue_premier";
		boolean flag = ab.regionMatches(0,ac,0,6);
		if(flag)System.out.println("Matched");
		else System.out.println("Not matched");
		boolean flagIgnore = ab.regionMatches(true, 0, ac,0, 6);
		
		if(flagIgnore)System.out.println("Matched Ignoring Case");
		else System.out.println("Not matched ignoring case");
		
		//string creates new objects for modifying objects but buffer doesn't
		
		
		
	}

}
