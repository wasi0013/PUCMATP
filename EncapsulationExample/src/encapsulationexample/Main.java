package encapsulationexample;
import unknown.UnknownFriend;
public class Main {

	public static void main(String[] args) {
		CloseFriend kanchan = new CloseFriend();
		kanchan.getStatus();
		UnknownFriend someone = new UnknownFriend();
		someone.getStatus();
		Class2 ob = new Class2();
		ob.getStatus();
	}

}
