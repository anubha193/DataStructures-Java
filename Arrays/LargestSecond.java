package Arrays;

import java.util.Scanner;

public class LargestSecond {
	public static int largest(int arr[])
	{
		int larg=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[larg])
				larg=i;
		}
		return larg;
	}
	public static int slargest(int arr[])
	{
		int max=0,max2=-1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				max2=max;
				max=i;
			}
			else if(arr[i]<arr[max])
			{
				if(max2==-1 || arr[i]>arr[max2])
					max2=i;
			}
				
		}
		return max2;
	}
	public static int tlargest(int arr[])
	{
		int tlarg=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>arr[tlarg]) &&(arr[i]!=+arr[largest(arr)] && arr[i]!=arr[slargest(arr)]))
				tlarg=i;
		}
		return tlarg;
	}
//	public static int slargest(int arr[])
//	{
//		int man=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>arr[man] && (arr[i]!=arr[largest(arr)]))
//				
//				man=i;
//		}
//		
//		return man;
//	}
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
	       System.out.println( "the largest element is="+arr[largest(arr)]);
	       System.out.println( "the second largest element is="+arr[slargest(arr)]);
	      	System.out.println("the thirf largest element of array is="+ arr[tlargest(arr)]);
	}

}
