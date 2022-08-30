package Mathmatices;

public class PrintSortDivisor {
	 static void printDivisor(int n)
     {
         int i=1;
         for(;i*i<=n;i++)
                if(n%i==0) {
                    System.out.print(i+ " "); }
         i--;
         for(;i>=1;i--)
                if(n%i==0) {
                    if(n/i!=i)
                    System.out.print(n/i+" "); }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDivisor(100);
	}

}
