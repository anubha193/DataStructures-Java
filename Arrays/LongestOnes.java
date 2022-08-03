package Arrays;

import java.util.Arrays;

public class LongestOnes {
     public static int ones(int arr[])
     {
    	 for(int i=1;i<arr.length;i++)
    	 {
    		 if(arr[i]==1)
                arr[i]=arr[i]+arr[i-1];
    	 }
    	 Arrays.sort(arr);
    	 return arr[arr.length-1];
     }
     public static int ones2(int nums[])
     { 
    	 int n= nums.length;
    	 int counter = 0, max=0;
           for(int i=0;i<n;i++)
    	     {
    	         if(nums[i]==1)
    	             counter++;
    	         else 
    	         {
    	             max=Math.max(max, counter);
    	                 counter = 0;
    	         }
    	         
    	     } 
           max=Math.max(max, counter);
    	     return max;
    	 }

     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,1,0,0,1,1,1,1,1,1,1,0};
		int nums=ones(arr);
		int nums2=ones2(arr);
		System.out.println("the majority element is="+nums);
		System.out.println("the majority element is="+nums2);
	}

}
