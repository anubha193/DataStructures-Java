package simpleJavaProgram;
import java.util.*;
public class javaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array=");
		int n=sc.nextInt();
		int nums[] = new int[n];
		System.out.print("enter the element of array");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum+=nums[i];
		}
		int a=sum/n;
		for(int i=0;i<n;i++)
		{
			if(nums[i]>a)
				System.out.print(nums[i]+" ");
		}
	}

}
