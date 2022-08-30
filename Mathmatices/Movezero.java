package Mathmatices;

import java.util.ArrayList;

public class Movezero {
	public static   ArrayList<Integer> move(ArrayList<Integer> arr)
	{
		 int len = arr.size();
	        int index = 0;
	        for (int i = 0; i < len; i++) {
	            if (arr.get(i) != 0) {
	                arr.set(index++, arr.get(i));
	            }
	        }
	        while (index < len) {
	            arr.set(index++, 0);
	        }
	        return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> arr=new ArrayList<>();
       arr.add(1);
       arr.add(3);
       arr.add(0);
       arr.add(0);
       arr.add(2);
       arr.add(3);
       arr.add(0);
       System.out.println(move(arr));
	}

}
