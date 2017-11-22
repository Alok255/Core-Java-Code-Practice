
public class App1 {

	public static void main(String[] args) {

		//Robot tr=new Robot();
		
		
		Test test=new Test(6);
		
		/* The Brain class is private so its not visivble
		Test.Brain tb=test.new Brain();
			tb.think();
		*/
		
		Test.Robot tb=test.new Robot();
			tb.work();
		
	}

}
