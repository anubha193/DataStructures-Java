package Arrays;

import java.util.Scanner;

public class ArrayReverse {
    public static void reverse(int arr[])
    {
      for(int i=arr.length-1;i>=0;i--)
      {
    	 
    	 System.out.print(arr[i]+ " ");
      }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of an array=");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("enter the element of array=");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("the rever of given array is=");
	        reverse(arr);
//	        for(int i=0;i<n;i++)
//	        {
//	        	System.out.print(arr[i]+" ");
//	        }
	}

}
