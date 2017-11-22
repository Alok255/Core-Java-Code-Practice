package books;

import java.util.ArrayList;

class Publiser{
	int SNo;
	String bName,author,quantity;
	
	public Publiser(int SNo, String bName, String author, String quantity){

		this.SNo=SNo;
		this.bName=bName;
		this.author=author;
		this.quantity=quantity;
		
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Publiser p1= new Publiser();
		Publiser p2= new Publiser(1, "JAVA", "JAVA BOOK", "12");
		Publiser p1= new Publiser(2, "C++", "C++ BOOK", "32");
		Publiser p3= new Publiser(3, "C", "C BOOK", "90");
		
	ArrayList<Publiser> addbook=new ArrayList<Publiser>();
		addbook.add(p2);
		addbook.add(p3);
		addbook.add(p1);
		
		System.out.println("Details of Books");
		for(Publiser pbook : addbook){
			System.out.println( pbook.SNo + pbook.bName + pbook.author + pbook.quantity);
		}
				
		}
	}


