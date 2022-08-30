package Mathmatices;

public class TrailingZero {
	static int z(int n)
	{
		int res=0;
		for(int i=5;i<=n;i=i*5)
		{
			res=res+n/i;
		}
		return res;
	}
      static int zero(int n) {
    	  if(n<5)
    		  return 0;
    	  return  n/5+zero(n/5);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(zero(30));
      System.out.println(z(30));
	}

}
