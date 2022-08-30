package Mathmatices;

import java.util.ArrayList;

public class MoveNegative {
	public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        // Write your code here.
        int len = nums.size();
            int index = 0;
            for (int i = 0; i < len; i++) {
                if (nums.get(i)> 0) {
                    nums.set(index++, nums.get(i));
                }
            }
             for (int i = 0; i < len; i++) {
                 if(nums.get(i)< 0)
                nums.set(index++,  nums.get(i));
            }
       return nums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(-2);
		arr.add(-3);
		arr.add(3);
		arr.add(6);
		arr.add(-5);
		arr.add(4);
		System.out.println(separateNegativeAndPositive(arr));

	}

}
