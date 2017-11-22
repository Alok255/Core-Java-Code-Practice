package transientkeyword;

import java.io.Serializable;

public class Alok implements Serializable{

	private  String name;
	private  int Id;
	
	public Alok(String name, int Id){
		this.name=name;
		this.Id=Id;
	}

	public String toString(){
		
		return "UserName =" + name + " Id=" + Id + "]";
	}
}
