package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayMaxSub {
public static int sub(int arr[])
{
     
	
	int curr=0;
    int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	curr=curr+arr[i];

	if(curr>max)
		max=curr;
	if(curr<0)
	{
		curr=0;

	}
}

return max;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {-1, 2};
//		Scanner sc=new Scanner(System.in);
//		 System.out.println("enter the size of an array=");
//	        int n=sc.nextInt();
//	        int arr[]=new int[n];
//	        System.out.println("enter the element of array=");
//	        for(int i=0;i<n;i++)
//	        {
//	        	arr[i]=sc.nextInt();
//	        }
	        int m=sub(arr);
	        System.out.println("the maximum sum of the sub array is "+m);
	}

}
