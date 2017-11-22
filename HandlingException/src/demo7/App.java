package demo7;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Nested Try Catch
		try{
			
			//1.Nested try
			try{
				System.out.println("Going to divide");
				int num=20/0;
			}catch(ArithmeticException e){
				System.out.println(e);
			}
			
			//2.Nested Try
			try{
				System.out.println("Array :");
				int a[]=new int[5];
				a[5]=4;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println("othe statement");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
