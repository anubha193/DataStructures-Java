package Mathmatices;

public class FastPower {
       static int power(int a,int b)
       {
    	   int res=1;
    	   while(b>0)
    	   {
    		   if((b&1)!=0)//only for odd
    			   res*=a;
    		   a=a*a;
    		   b=b>>1;
    	   }
    	   return res;
       }
       static int fastPower(int a,int b)
       {
    	   if(b==0)return 1;
    	   int half=fastPower(a,b/2);
    	   int full=half*half;
    	   if(b%2!=0)
    		   full*=a;
    	   return full;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(power(2,3));
       System.out.println(fastPower(2,3));
	}

}
