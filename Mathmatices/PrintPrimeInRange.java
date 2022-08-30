package Mathmatices;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPrimeInRange {
	 static ArrayList<Integer> primeRange(int M, int N) {
	       
	        ArrayList<Integer>list=new  ArrayList<Integer>();
	       boolean is_prime[]=new boolean[N+1];
	       Arrays.fill(is_prime,true);
	       
	       for(int i=2;i*i<=N;i++)
	       {
	           if(is_prime[i])
	           {
	           
	           for(int j=i*i;j<=N;j+=i)
	           {
	               is_prime[j]=false;
	           }
	           }
	       }
	       
	    for(int i=M;i<=N;i++)
	   {
	       if(i==1)
	       continue;
	       
	     if(is_prime[i])
	     list.add(i);
	   }
	   return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(primeRange(10,20));
	}

}
