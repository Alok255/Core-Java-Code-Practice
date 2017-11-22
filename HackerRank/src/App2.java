import java.util.*;
import java.io.*;
import java.lang.Math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int j;
        for(int i=0;i<t;i++){
            int a = in.nextInt();//initial value
            int b = in.nextInt();
            int n = in.nextInt();//sequence number
            int arr[]=new int[n];
            for(j=0;j<n;j++)
                {
                  int temp=a;
                 for(int inc=0;inc<=j;inc++)
                     {
                     temp=temp+(int)(Math.pow(2,inc)*b);
                     }
                  arr[j]=temp;
            }
            for(j=0;j<n;j++)
                {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}

