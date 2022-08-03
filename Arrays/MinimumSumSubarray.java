package Arrays;

public class MinimumSumSubarray {
      public static int sum(int arr[])
      {
    	  int curr=0;
    	  int min=Integer.MAX_VALUE;
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  curr=curr+arr[i];
    		  if(curr<min)
    			  min=curr;
    		  if(curr>0)
    			  curr=0;
    	  }
    	  return min;
      }
	public static void main(String[] args) {
//		int arr[]= {3, -4, 2, -3, -1, 7, -5};
		int arr[]={2, 6, 8, 1, 4};
		System.out.println(sum(arr));
	}

}
