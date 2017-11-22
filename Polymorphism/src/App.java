public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant = new Plant();
		Tree tree = new Tree();

		tree.grow();
		plant.grow();
		
		//claa doGrow method with paramenter
		doGrow(plant);

	}
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
