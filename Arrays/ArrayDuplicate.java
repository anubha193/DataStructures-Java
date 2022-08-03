package Arrays;

import java.util.Scanner;

public class ArrayDuplicate {
     public static int duplicate(int arr[])
     { 
    	 int i=0;
    	 for(int j=1;j<arr.length;j++)
    	 {
    		 if(arr[i]!=arr[j])
    				 {
    			 i++;
    			 arr[i]=arr[j];
    				 }
    	 }
    	 return i+1;
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
	        int new_n=duplicate(arr);
	        for(int i=0;i<new_n;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	        
	}

}
