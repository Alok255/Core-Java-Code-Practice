
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, first=5, second=3, next,i;
		
		for(i=2; i<=10; i++){
			
			if(i<1){
				next=i;
			}else{
				next = first  + second;
				first = second;
				second=next;
			}
			System.out.println(next + "\t");
		}

	}

}
