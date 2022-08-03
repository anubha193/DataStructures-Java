package Arrays;

import java.util.Scanner;

public class ArrayDelete {
	public static void delete(int key,int arr[])
	{
         int m=0;
         int i=0;
		 for(;i<arr.length;i++)
	        {
	        	if(arr[i]==key)
	        	{
	        	m=i;
	           break;
	        	}
	        }
		 System.out.println(m);
		 for(i=m;i<arr.length-1;i++)
		 {
			 arr[i]=arr[i+1];
			// System.out.println(arr[i]);
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
        System.out.println("enter the element to be delete in array=");
        int temp=sc.nextInt();
       delete(temp,arr);
       for(int i=0;i<n-1;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
	}

}
