
public class App {

	public static void main(String[] args) {

		Animals animals =Animals.CAT;
		
		switch(animals){
		case BOY:
			System.out.println("Boy");
			break;
		case CAT:
			System.out.println("CAT");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		default:
			break;
		
		}
		System.out.println(Animals.BOY.getClass());
		
		System.out.println(Animals.BOY.getName());
		
		Animals animals2 =Animals.valueOf("CAT");
		System.out.println(animals2);

	}

}
