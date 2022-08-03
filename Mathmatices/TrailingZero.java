package Mathmatices;

public class TrailingZero {
      static int zero(int n) {
    	  if(n<5)
    		  return 0;
    	  return  n/5+zero(n/5);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(zero(10));
	}

}
