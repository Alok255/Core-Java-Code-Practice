class Home{
	private String name ="ALok Raj Singh";
	
	public void homeNow(){
		System.out.println("Hello this method is Access : " + name);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Home home = new Home();
			home.homeNow();
			System.out.println(home.name);

	}

}
