import java.util.Scanner;
import java.util.*;


public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	String name1= input.nextLine();
	
	String s2=name.substring(0,1).toUpperCase();
	name=s2+name.substring(1);
		
	
		String s1 =name1.substring(0,1).toUpperCase();
		name1=s1+name1.substring(1);
		int nameL=name.length();
		int name1L=name1.length();
		System.out.println(nameL+name1L);
		
		System.out.println(name1.compareTo(name)>0 ? "Yes" : "No");
		System.out.println(name +" "+ name1);
	}

}
