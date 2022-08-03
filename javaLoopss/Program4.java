package javaLoopss;

public class Program4 {

	public static void main(String[] args) {
		// seprate 0 and 1
       int nums[]= {0,1,0,1,0,1,0,1,0,1};
       int arr[]=new int[nums.length];
       int m=0;
       for(int i=0;i<nums.length;i++)
       {
    	  if(nums[i]==0)
    	  {
    	  arr[i]=nums[i];
    	  m++;
    	  }
       }
       for(int i=m;i<nums.length;i++)
       {
    	 arr[i]=1;  
       }
       //System.out.println(m);
       for(int i=0;i<nums.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	}

}
