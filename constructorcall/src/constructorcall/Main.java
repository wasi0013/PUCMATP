package constructorcall;
public class Main {

	public static void main(String[] args) {
		
		Man man1= new Man("Tango");
		man1.getName("Bingo");
		Man man2 = new Man("Alpha");
		man2.getName("Something I don't know");

		System.out.println(man1.name+"< >"+man2.name);

	}

}
