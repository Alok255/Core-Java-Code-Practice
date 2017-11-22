
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={
				"ALok","Raj","SIng"
		};
		
		System.out.println(name[0] + " " + name[1] + " " + name[2]);
			int[][] value= {
				{12,23,54,2},{23,4,6,7},{23,43},{12,7}
			
	};
		
			System.out.println(value[0][1] +" "+ value[1][3]+" "+value[3][0]);
			
			
			for(int i=0; i<value.length; i++){
				for(int j = 0; j<value[i].length; j++){
					System.out.println("Print MultiDimensional Array : \n" + value[i][j]);
				}
			}
	}
	}

