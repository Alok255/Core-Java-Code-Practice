
public class Person {

	int id;
	String name;
	public Person(String name, int id){
		this.id=id;
		this.name=name;
	}
	
	//Getter
	public String getName(){
		return "Name :" +name +" Id :"+id;
	}
	
	//Setter 
	public void setName(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public String toString(){
		return "User Name: " + name + "\nPasswor :"+id;
	}
	
}
