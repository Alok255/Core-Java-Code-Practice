package demo6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		
		int b[] = {
				2,4,6
		};
		
		
		
		try{
			a[5]=50/0;
			System.out.println(b[8]);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println(e);
		}
		
	}

}
