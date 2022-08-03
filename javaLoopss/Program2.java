package javaLoopss;
import java.util.Scanner;
public class Program2 {
	//sum of array elelment
          public static void main(String[] args)
          {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("enter the size of array=");
        	  int n=sc.nextInt();
        	  int sum=0;
        	  int arr[]=new int[n];
        	  int sum2=0;
        	  sum2=(n*(n+1))/2;
        	  System.out.println("if the re print in order from 1 to n"+sum2);
        	  System.out.println("enter the element of array");
        	  for(int i=0;i<n;i++)
        	  {
        		  arr[i]=sc.nextInt();
        		  //System.out.println(arr[i]);
        		  sum=sum+arr[i];
        	  }  
        	  System.out.println("the array is");
        	  for(int i=0;i<n;i++)
        	  {
        		 
        		  System.out.print(arr[i]+" ");
        		 
        	  }
        	  System.out.println();
        	  System.out.println("the sum is="+sum);
        	  
          }
}
