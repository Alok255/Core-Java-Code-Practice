class Add{
	static int sum(int a,int b){
		return a+b;
	}
	static int sum(int a,int b,int c){
		return a+b+c;
	}
}
public class OverloadingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//you can alos use this 
		/*int ans=Add.sum(2, 4);
		int ans1=Add.sum(5, 5, 5);
		*/
		Add add=new Add();
			int ans= add.sum(2,4);
			int ans1= add.sum(4,5,6);
		System.out.println("This is First Method:" + ans + " " + "This is Second :"+ans1);

	}

}
