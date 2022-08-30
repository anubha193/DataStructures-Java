package Arrays;

import java.util.ArrayList;
import java.util.*;

public class MajorityElementTwo {
	 public static List<Integer> majorityElement(int[] nums) {
		 List<Integer> result=new ArrayList<>();
	        
	        if(nums.length==1)
	        {
	            result.add(nums[0]);
	            return result;
	        }
	            
	        HashMap<Integer,Integer> map=new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            
	            if(map.containsKey(nums[i]))
	            {
	                map.replace(nums[i],map.get(nums[i])+1);
	            }
	            else
	            {
	                map.put(nums[i],1);
	            }
	        }
	        for (Integer i : map.keySet())
	        {
	            if(map.get(i)>nums.length/3)
	                result.add(i);
	        }
	        
	        return result;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,3};
		System.out.println(majorityElement(arr));

	}

}
