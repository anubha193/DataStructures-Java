package Arrays;

import java.util.Scanner;

public class Maxjminusi {
	public static int min2(int arr[])
	{
		int n=arr.length;
		int left[]=new int[n];
	left[0]=arr[0];
	for(int i=1;i<n;i++)
	{
		left[i]=Math.min(arr[i], left[i-1]);
	}
	int ans=Integer.MIN_VALUE;;
	int l=n-1,r=n-1;
	while(l>=0 && r>=0)
	{
		if(arr[r]>=left[l])
		{
			ans=Math.max(ans, r-l);
		l--;
		}
		else
			r--;
	}
	return ans;		
	}
public static int minn(int A[])
{
	int N=A.length;
	  if(N==2)
      {
          if(A[0]>A[1])
          return 0;
          else
          return 1;
      }
   int left[]=new int[N];
   int right[]=new int[N];
   left[0]=A[0];
   for(int i=1;i<N;i++)
   {
       left[i]=Math.min(left[i-1],A[i]);
   }
   right[N-1]=A[N-1];
   for(int i=N-2;i>=0;i--)
   {
       right[i]=Math.max(right[i+1],A[i]);
   }
   int ans=0;
   int l=0,r=0;
  while(l<N &&r<N)
  {
      if(right[r]>left[l])
      {
          ans=  Math.max(ans,r-l);
      r++;
   
      }
      else
      {
       
      l++;
      }
   
}
return ans;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		 System.out.println("enter the size of an array=");
//	        int n=sc.nextInt();
//	        int arr[]=new int[n];
//	        System.out.println("enter the element of array=");
//	        for(int i=0;i<n;i++)
//	        {
//	        	arr[i]=sc.nextInt();
//	        }
//		int arr[]= {3,4,5,1,7,2,6,5,4,1};
		int arr[]= {3,5,1,4,2,1};
		System.out.println(minn(arr));
		System.out.println(min2(arr));
	}

}
