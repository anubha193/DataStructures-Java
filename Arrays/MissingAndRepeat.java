package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MissingAndRepeat {
	 public static ArrayList<Integer> missingAndRepeating(ArrayList<Integer> arr, int n) {
	        // Write your code here
	         int num=1;
	       ArrayList<Integer> al=new ArrayList<>();
	     Collections.sort(arr);
	       
	        for(int i=0;i<n;i++)
	        {
	            if(arr.get(i)==num)
	            num++;
	        }
	        al.add(num);
	        int k=0;
	       
	       for(int i=0;i<n-1;i++)
	       {
	           if(arr.get(i)==arr.get(i+1))
	               k=arr.get(i);
	       }
	       al.add(k);	       
	       return al;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(6);
		System.out.println(missingAndRepeating(al,al.size()));
             
	}

}
