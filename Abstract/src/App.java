
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Machine machine=new Machine();
		 * Error Because of abstract class
		 */
		Camera camera=new Camera();
			camera.setId(5);
		Car car =new Car();
			car.setId(6);
			
			System.out.println(camera.getId());
			System.out.println(car.getId());
			
		car.start();//call abstract class using Car class
		
		camera.start();
		
		car.run();
		
		camera.run();
		
		camera.doStuff();
		
		car.doStuff();
		
	}

}
