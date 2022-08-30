package Mathmatices;

public class LargestPrimeFactor {
	 static void divisor(int n)
     {
		 int res=0;
     	for(int i=1;i*i<=n;i++)
     		if(n%i==0) {
     			res=Math.max(res,primeAdvance(i) );
     			     if(n/i!=i)
     			    	res=Math.max(res,primeAdvance(n/i));
     			     }
     	System.out.println(res);
     }
	static int primeAdvance(int n)
    {
   	 if(n==1)return 0;
   	 if(n==2 ||n==3)return n;
   	 if(n%2==0 || n%3==0)return 0;
   	 for(int i=5;i*i<=n;i+=6)
   		 if(n%i==0|| n%(i+2)==0)return 0;
   	 return n;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     divisor(28);
	}

}
