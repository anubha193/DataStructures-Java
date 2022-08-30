package Arrays;

public class StockBuySell {
	static int celler(int arr[])
	{
		int min=arr[0];
		int maxpro=0;
		for(int i=0;i<arr.length;i++)
		{
			min=Math.min(min, arr[i]);
			maxpro=Math.max(maxpro, arr[i]-min);
		}
		return maxpro;
	}
      static int cell(int[] arr)
      {
    	  int nums[]=new int[arr.length];
    	  int max=Integer.MIN_VALUE;
    	  for(int i=arr.length-1;i>=0;i--)
    	  {
    		  max=Math.max(max, arr[i]);
    		  nums[i]=max;
    	  }
    	  max=Integer.MIN_VALUE;
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  max=Math.max(max, nums[i]-arr[i]);
    	  }
    	  return max;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {100, 180, 260, 310, 40, 535, 695};
     System.out.println(cell(arr));
     System.out.println(celler(arr));
	}

}
