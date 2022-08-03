package Arrays;

import java.util.Scanner;

public class ArraySort {
     public static boolean isSort(int arr[])
     {
    	 for(int i=1;i<arr.length;i++)
    	 {
    		 if(arr[i]<arr[i-1])
    			 return false;
    	 }
    	 return true;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of an array=");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("enter the element of array=");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
            if(isSort(arr)){
            	System.out.println("array is sorted");
            }
            	else
            	{
            		System.out.println("array is unsorted");
            	}
            }
	}


