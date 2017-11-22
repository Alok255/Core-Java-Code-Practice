
public class App {
	//Create Method Pass BY Value
	void display(int id,String name){
		System.out.println("Name :" +name + "Id :" +id);
	}
	
	//Create Method
	void show(int num){
		System.out.println("Number :" + num);
	}
	
	public static void main(String[] args){
		
		App app=new App();
		
		//Pass Value
		app.display(21, "Alok Raj");
		app.show(9);
		
		//Pass By Method
		
		Person person=new Person("Pintu", 3);
				System.out.println("This is PassByMethod :" +person.toString());
				
			person.setName("Rajeev", 10);
			String name1=person.getName();
			System.out.println(name1);
	}
}
