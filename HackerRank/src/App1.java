import java.util.*;
import java.io.*;
import java.math.*;
public class App1 {

	public static void main(String[] args) {
		 
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		        for(int i=0;i<t;i++){
		            int a = in.nextInt();
		            int b = in.nextInt();
		            int n = in.nextInt();
		            int arr[]=new int[n];
		            
		            for(int j=0;j<n;j++){
		            	int temp=a;
		            		for(int inc=0; inc<=j; inc++){
		            			 temp=temp+(int)(Math.pow(2,inc)*b);
		            		}
		            	arr[j]=temp;	
		            }
		            for(int j=0;j<n;j++){
		            	System.out.println(arr[j] + " ");
		        }
		            System.out.println();
		       
		    }
		        in.close();

	}

}
