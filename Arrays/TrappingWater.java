package Arrays;

import java.util.Scanner;
//space complexity o(1);
public class TrappingWater {
	public static int waterr(int arr[])
	{
		int n=arr.length;
		int left[]=new int[n];
		int[] right=new int[n];
		left[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1],arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1],arr[i]);
		} int ans=0;
		for(int i=0;i<n;i++)
		{
			ans+=(Math.min(left[i],right[i])-arr[i]);
		}
		return ans;
	}
	public static int water(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		int lmax=0,rmax=0;
		int ans=0;
		while(left<right)
		{
			if(arr[left]<=arr[right])
			{
				if(lmax<arr[left])
					lmax=arr[left];
				else
					ans+=(lmax-arr[left]);
				left++;
			}
			else
			{
				if(arr[right]>rmax)
					rmax=arr[right];
				else
				ans+=(rmax-arr[right]);
				right--;
			}
		}
		return ans;
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
	        System.out.println("the total water in block is="+water(arr));
	        System.out.println("the total water in block is="+waterr(arr));
	}

}
