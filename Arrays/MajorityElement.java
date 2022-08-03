package Arrays;

public class MajorityElement {
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
	System.out.println("the majority element is="+nums);
	}

}
