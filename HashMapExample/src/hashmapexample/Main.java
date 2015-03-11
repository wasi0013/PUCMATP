package hashmapexample;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bob");
		al.add("Jack");
		al.add("Tom");
		al.add("Jerry");
	
		ArrayList<String> al2 = new ArrayList <String>();
		al2.add("Tango");
		al2.add("Alpha");
		al2.add("Gama");
		al2.add("Beta");
		
		HashMap<String,ArrayList<String>> value = new HashMap<String,ArrayList<String>>();
		value.put("trainer",al);
		value.put("student",al2);
		System.out.println(value);
		
		ArrayList<String> trainer = new ArrayList<String>();
		ArrayList<String> student = new ArrayList<String>();
		trainer = value.get("trainer");
		student = value.get("student");
		System.out.println("Trainers are: "+trainer+" Students are: "+student);
		
		
		
		
		
		

	}

}
