package Mathmatices;

public class SumOfAllPrimeFrom1ToN {
	 public static long prime_Sum(int n)
	    {
	        // code here
	       boolean arr[]=new boolean[n+1];
	        	for(int i=0;i<=n;i++)
	        	{
	        		arr[i]=true;
	        	}
	        	arr[0]=false;
	        	arr[1]=false;
	        	for(int i=2;i*i<=n;i++){
	                for(int j=2*i;j<=n;j +=i){
	                    arr[j]=false;
	                }
	        	}
	        	long sum=0;
	                for(int i=1;i<=n;i++)
	                {
	                	if(arr[i])
	                		sum=sum+i;
	                }
	                return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(prime_Sum(5));
	}

}
