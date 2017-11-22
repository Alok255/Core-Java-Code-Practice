// #Public #Private #Protected 

//Create a class which have Private Variable and Method 

class Car{
	
	private Car(){ //Private constructor
		
	}
	private String carname="BMW";
	
	private void carMethod(){
		System.out.println("This is Private Method");
	}
}
public class App {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
			car.carMethod();
			System.out.println(car.carname);

	}

}
