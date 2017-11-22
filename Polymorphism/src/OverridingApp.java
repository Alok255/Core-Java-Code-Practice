class Bank{
 int getRateOfInterest(){
		return 0;
	}
}	
class Sbi extends Bank{
	 int getRateOfInterest() {
		return 8;
	}
} 
class Pnb extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
class Axis extends Bank{
	int getRateOfInterest(){
		return 6;
	}
}


public class OverridingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Sbi s =new Sbi();
		Pnb p =new Pnb();
		Axis a =new Axis();
	System.out.println("This is SBI: " + s.getRateOfInterest());	
	System.out.println("This is SBI: " + p.getRateOfInterest());	
	System.out.println("This is SBI: " + a.getRateOfInterest());	
			bank.getRateOfInterest();
		Pnb pnb = new Pnb();
		

	}

}
