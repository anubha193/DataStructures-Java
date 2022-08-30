package Mathmatices;

import java.util.ArrayList;

public class SieveOfEratosthenes {
         static ArrayList<Integer> seive(int n)
         {
        	 ArrayList<Integer> al=new ArrayList<>();
        	 boolean arr[]=new boolean[n+1];
        	for(int i=0;i<n;i++)
        	{
        		arr[i]=true;
        	}
        	arr[0]=false;
        	arr[1]=false;
        	for(int i=2;i*i<=n;i++){
        		if(arr[i]) {
                for(int j=2*i;j<=n;j +=i){
                    arr[j]=false;
                }
        		}
        	}
                for(int i=1;i<=n;i++)
                {
                	if(arr[i])
                		al.add(i);
                	
                }
                
                return al;
            }
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(seive(20));
	}

}
