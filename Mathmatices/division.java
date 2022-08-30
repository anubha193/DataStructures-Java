package Mathmatices;

public class division {
      static int div(int dividend,int divisor)
      {
    	  if(dividend==Integer.MIN_VALUE&&divisor==-1)
              return Integer.MAX_VALUE;
    	  return dividend/divisor;
    
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(div(-10,2));
        System.out.println(Integer.MIN_VALUE);
	}

}
