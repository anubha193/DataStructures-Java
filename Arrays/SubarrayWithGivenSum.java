package Arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
      static ArrayList<Integer> arr(int arr[],int k)
      {
    	  ArrayList<Integer> al=new ArrayList<>();
    	  int i=0,j=0;
    	  int sum=0;
    	  
    	  while(i<arr.length && j<arr.length)
    	  {
    		  sum=sum+arr[j];
    		 // System.out.println(sum);
    		  if(sum==k)
    		  {
    			  al.add(i+1);
    			  al.add(j+1);
    			  return al;
    		  }
    		  else if(sum<k)
    			  j++;
    		  else
    		  {
    			  i++;
    			  j=i;
    			  sum=0;
    		  }
    	  }
    	  al.add(-1);
    	  return al;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,2,3,7,5};
         int k=12;
         System.out.println(arr(arr,k));
	}

}
