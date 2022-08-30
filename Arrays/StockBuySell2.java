package Arrays;

public class StockBuySell2 {
	 public static int maxProfit(int[] arr) {
	        int max=0;
	        for(int i=1;i<arr.length;i++)
	        {
	            if(arr[i]>arr[i-1])
	                max+=(arr[i]-arr[i-1]);
	        }
	        return max;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,3,6,4};
	     System.out.println(maxProfit(arr));

	}

}
