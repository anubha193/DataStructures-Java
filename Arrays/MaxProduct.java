package Arrays;

import java.util.Scanner;

public class MaxProduct {
public static int maxx(int arr[])
{
	int max=Integer.MIN_VALUE;
	int cur=1;
	for(int i=0;i<arr.length;i++)
	{
		cur=cur*arr[i];
		if(max<cur)
			max=cur;
		if(cur==0)
			cur=1;
	}
    cur=1;
	for(int i=arr.length-1;i>=0;i--)
	{
		cur=cur*arr[i];
		if(max<cur)
			max=cur;
		if(cur==0)
			cur=1;
	}
	return max;
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
	        System.out.println("the maximum product of the subarray is "+maxx(arr));
	}

}
