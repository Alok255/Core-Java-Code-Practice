class Robot{
	public void speak(String name) {//declaration parameter String  inside method
		System.out.println(name);
	}
	
	public  void jump(int num) {//declaration parameter Integer  inside method
		System.out.println("The Jump Methods :" + num);
	}
	
	public void move(String name1, double num1) {
		System.out.println("Move Method call String :" + name1 + "\t and Double :" + num1);
	}
}
public class Testfirst {

	public static void main(String[] args) {

		Robot robot = new Robot();
			robot.speak("Helllo Alok");//Passing Parameter inside method
			robot.jump(21);
			robot.move("Alok Raj SIngh", 17);

	}

}
