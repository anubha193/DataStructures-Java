package array;

import java.util.HashSet;

public class firstRepeadtedelement {
       public static int repeat(int arr[])
       {
    	   int min=-1;
           HashSet<Integer> hs=new HashSet<>();
           for(int i=arr.length-1;i>=0;i--)
           {
        	   if(hs.contains(arr[i]))
        		   min=i;
        	   else
        		   hs.add(arr[i]);
        	 
           }
          return min;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {10, 5, 3, 4, 3, 5, 10};
       System.out.println("the first repeated element in the array is="+arr[repeat(arr)]);
	}

}
