package Mathmatices;

public class MatrixWays {
         static int ways(int m,int n) {
        	 if(m==1 || n==1)
        		 return 1;
        	 int right=ways(m-1,n);
        	 int left=ways(m,n-1);
        	 int sum=left+right;
        	 return sum;
        	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.print(ways(3,3));
	}

}
