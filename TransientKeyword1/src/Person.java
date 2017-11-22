import java.io.Serializable;


public class Person implements Serializable{

	private transient String name;
	private int id;
	public Person(String name, int id) {
		
		this.name=name;
		this.id=id;
		
	}

	public String toString(){
		return "Person [ id=" +name +" Age =" +id+ "]";
				}
	
	
	
}
