package userdefind;

import java.util.ArrayList;
import java.util.Iterator;

class Test{
	int num;
	String name;
	
	public Test(String name, int num){
		this.name=name;
		this.num=num;
	}
	
	public String toString(){
		return "Name :" +name+ " Id :" +num;
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test("Alok", 2);
		Test test1=new Test("Singh",33);
		Test test2=new Test("Raj", 21);
		
	ArrayList<Test> alist=new  ArrayList<Test>();
		alist.add(test);
		alist.add(test1);
		alist.add(test2);
		
		Iterator iter=alist.iterator();
		while(iter.hasNext()){
			Test ts=(Test)iter.next();
			System.out.println(ts);
		}

	}

}
