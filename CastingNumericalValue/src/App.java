
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Alok";
		String name1="2016";
		int num=210;
		double num1=20.19;
		float num2 =21.2f;
		byte num3=127;
		char add='A';
		
		System.out.println(Byte.MAX_VALUE);
		
		//Casting is use to change the value
		num =(int)num1;
		System.out.println(num);
		
		//Cast float value to int
		int num4=(int)num2;
		System.out.println(num4);
		
		//Casting String to int
		int nameValue= Integer.parseInt(name1);
		
		
		System.out.println(nameValue);
	}

}
