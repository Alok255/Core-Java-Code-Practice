package demo8;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num = 20 / 0;
			System.out.println(num);
		} catch (NullPointerException e) {
			System.out.println("Catch error :" + e);
		}

		finally {
			System.out.println("Final Block is execute!");
		}
	}

}
