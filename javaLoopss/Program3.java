package javaLoopss;

public class Program3 {

	public static void main(String[] args) {
		// maximum and minimum element of an array
      int nums[]= {0,23,45,76,5,32,3,5,2,98,102};
      int max=nums[0],min=nums[0];
      for(int i=0;i<nums.length;i++)
      {
    	 if(nums[i]>max)
    	 {
    		 max=nums[i];
    	 }
    	 if(nums[i]<min)
    	 {
    		 min=nums[i];
    	 }
      }
    
      System.out.println("the maximum element of an arrray is="+max);
      System.out.println("the manimum element of an arrray is="+min);
     
	}

}
