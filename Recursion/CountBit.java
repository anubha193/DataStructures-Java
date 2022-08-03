package Recursion;

import java.util.Scanner;

public class CountBit {
     static int count(int n)
     {
    	 if(n==0)
    	       return 0;
    	       else
    	       return 1+count(n&(n-1));
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number =");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=count(i);
		}
     System.out.println(sum);
	}

}
