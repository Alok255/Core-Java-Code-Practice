class Machine{
	public void start() {
		System.out.println("The Machine is Start");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera Start");
	}
	
	public void snap() {
		System.out.println("The Camer Snap");
	}
}
public class App {

	public static void main(String[] args) {
		
		//Simple Override the method start()
		Machine machine =new Machine();
		Camera camera = new Camera();
				machine.start();
				camera.start();
				
				//UpCasting
				Machine machine2=camera;
					//Whem i run this it's call Camera Start method
				machine2.start();
				//But i call snap() method it's error
				//machine2.snap();
				
				//DownCasting
				Machine machine3=new Camera();
				Camera camera2=(Camera)machine3;
					camera2.start();
					camera2.snap();
	}

}
