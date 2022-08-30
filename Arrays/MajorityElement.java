package Arrays;

import java.util.HashMap;

public class MajorityElement {
	static int major(int arr[])
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
					hm.replace(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i], 1);
		}
		int n=arr.length/2;
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i])>n)
				return arr[i];
		}
		return -1;
	}
     public static int majority(int arr[])
     {
    	 int curr=-43426342;
    	 int count=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(count==0)
    		 {
    			 curr=arr[i];
    			 count=1;
    		 }
    		 else if(arr[i]==curr)
    			 count++;
    		 else
    			 count--;
    	 }
    	 int maxcount=0;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]==curr)
    			 maxcount++;
    	 }
    	 if(maxcount>arr.length/2)
    	 return curr;
    	 else 
    		 return -1;
     }
	public static void main(String[] args) {
		int arr[]= {3,1,3,3,2};
	int nums=majority(arr);
	int nums2=major(arr);
	System.out.println("the majority element is="+nums);
	System.out.println("the majority element is="+nums2);
	}

}
