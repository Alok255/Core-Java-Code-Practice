class Plant{
	public static final int ID=7; //final varcan't be change
	private String name;
	
	public String getDate(){
		String date="Some of date " + calDate() + " \nID :"+ ID;
		return date;
		
	}
	
	private int calDate(){
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class App {

	public static void main(String[] args){
		Plant plant = new Plant();
			plant.setName("ALok Raj Sing");
			
			System.out.println(plant.getName() + "\n " + plant.getDate());
	}
}
