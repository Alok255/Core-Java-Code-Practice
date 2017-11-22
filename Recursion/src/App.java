
public class App {
	static int num=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call factorial method 
				System.out.println(" Factorial :"+factorial(4));
p();
}
	//Create Factorial 
		private static int factorial(int num){
			
			if(num==1){
				return 1;
			}
			return factorial(num -1) * num;
		}
		
		//Simple Recursion
		static void p(){
			num++;
			if(num<=5){
			System.out.println("HELLO!" + num);
			p();
			}
			}
}
