/**
 * 
 */
package Arrays;

import java.util.ArrayList;

public class ArrayMaxSub2 {
      static ArrayList<Integer> sum(int arr[])
      {
    	  ArrayList<Integer> al=new ArrayList<>();
          int curr=0;
          int max=Integer.MIN_VALUE;
          for(int i=0;i<arr.length;i++)
          {
  	    curr=curr+arr[i];
  	    al.add(arr[i]);
  	    if(curr>max)
  		max=curr;
       	if(curr<0)
       	{
  		curr=0;
        al.clear();
       	}
          }
          return al;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {-1,2};
        System.out.println(sum(arr));
	}

}
