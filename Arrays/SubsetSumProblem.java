package Arrays;

public class SubsetSumProblem {
     static boolean subsetSum(int[] arr,int sum,int n) {
    	 if(sum<0) return false;
    	 if(n<=0) return false;
    	 if(sum==0)return true;
    	 return subsetSum(arr,sum-arr[n-1],n-1) || subsetSum(arr,sum,n-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3, 34, 4, 12, 5, 2};
      int sum=500;
      System.out.println(subsetSum(arr,sum,arr.length));
	}

}
