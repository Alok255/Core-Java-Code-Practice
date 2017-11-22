import java.util.*; 

public class Test {

	public static void main(String[] args) {
		// First initialize Array Object
		//ArrayList<String> sname= new ArrayList<String>();
		ArrayList<String> sname=new ArrayList<String>();
			sname.add("Alok Raj");
			sname.add("Rajeev Kumar");
			sname.add("Pintu Gupta");
			
			for(String fname : sname){
				System.out.println("List of Student Name is :" + fname);
			}
			
		ArrayList<Integer> number = new ArrayList<Integer>();
				number.add(23);
				number.add(7667);
				number.add(43);
				number.add(433);
			
		for(int num : number){
			System.out.println("Number is : " + num);
		}
		
		
		//Simple Array in Java
		int[] value = new int[3];
			value[0] =10;
			value[1] =20;
			value[2] =14;
			
		System.out.println("Print Simple Array :\n " +value[0] + value[2] + value[1]);	
		
		//Simple Array for String 
		String[] name;
		name= new String[3];
			name[0] = "Alok\n";
			name[1] = "Rajeev\n";
			name[2] = "Sab";
		System.out.println(name[0] + name[1] + name[2]);	
		for(String uname : name){
			System.out.println("ForEach Loop \n" + uname);
		}
		
		//We can also create Array like
		int[] number1 = {
				1,4,33,54,65,76
		};
		for(int i=0; i<number1.length; i++){
			System.out.println("Print Array : " + number1[i]);
		}
				
	}

}
