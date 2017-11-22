
public enum Animals {
	DOG("Alok"), CAT("Raj"), BOY("Singh");
	
	private String name;
	
	//Create constructor
	Animals(String name){
		this.name=name;
		
	}
	
	 public String getName(){
		return name;
	}
	 
	 public String setName(){
		 return "This Animal" + name;
	 }
}
