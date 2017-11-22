class Machine{
	public void start(){
		System.out.println("Hello Machine Start!");
	}
}
public class App implements Camera{
 public static void main(String[] args) {
	Machine machine = new Machine(){
		@Override public void start(){
			System.out.println("Hello Machine Stoped");
		}
	};
	machine.start();
	
	Camera camera = new Camera() {
		
		@Override
		public void snap() {
			System.out.println("Camer Method is call snap()");
			
		}
	};
	
	camera.snap();
}

@Override
public void snap() {
	// TODO Auto-generated method stub
	
}
}
