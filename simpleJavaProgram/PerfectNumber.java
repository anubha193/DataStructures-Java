package simpleJavaProgram;

public class PerfectNumber {
      static int factorial(int n)
      {
    	  int sum=0;
          int a=0;
          int temp=n;
          while(n!=0)
          {
            a=n%10;
            sum=sum+fact(a);
            n=n/10;
          }
          if(sum==temp)return 1;
          else
          return 0;
      }
      static int fact(int n)
      {
    	  if(n==0)
    	        return 1;
    	        return n*fact(n-1); 
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(factorial(145));
	}

}
