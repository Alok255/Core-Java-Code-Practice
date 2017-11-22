


public class Test {
	int id1;
	public Test(int id){
		this.id1=id;
	}
	
	private class Brain{
		public void think(){
			System.out.println("Hello Robot " + id1 + "can think");
		}
	}
	
	public void start(){
		System.out.println("Test Running : " + id1);
	}
	
	//Now create inner classes
	public class Robot{
		public void work(){
			System.out.println("The Robot " + id1 + "is run!");
		}
	}

	
}
