package Arrays;

import java.util.HashMap;

public class SubArrayWithZeroSum {
      static int sub(int arr[])
      {
    	  HashMap<Integer,Integer> hm=new HashMap<>();
    	  hm.put(-1, 0);
    	  int count=0;
    	  int max=0;
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  count=count+arr[i];
    		if(hm.containsKey(count)) 
    			max=Math.max(max, i-hm.get(count));
    		else
    			hm.put(count, i);
    	 }
    	  return max;
      }
      
	public static void main(String[] args) {
	    
		int arr[]= { 15,-2,2,-8,1,7,10,23};
		System.out.println(sub(arr));
	}
     }

