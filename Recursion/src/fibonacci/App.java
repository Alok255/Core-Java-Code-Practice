package fibonacci;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		
		System.out.println(n1 + " " +n2);
		
		printFibo(count -2);

	}

	static int n1=0, n2=1, n3=0;
	static void printFibo(int count){
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" " + n3);
			System.out.println("Count ="+count);
			printFibo(count -1);
		}
	}
}
