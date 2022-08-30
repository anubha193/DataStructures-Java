package Mathmatices;

public class Fibonacci {
    static int fibbo(int n)
    {
    	 int f1=0;
         int f2=1;
         int f3=0;
         if(n==0)return 0;
         if(n==1)return 1;
         for(int i=3;i<=n;i++)
         {
            f3=(f1+f2)%1000000007;
             f1=f2;
             f2=f3;
         }
         return f3;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(fibbo(6));
	}

}
