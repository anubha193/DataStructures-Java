package Mathmatices;

public class Josephus {
	static int josephus(int n,int k)
	{
		if(n==1)
			return 1;
		return ((josephus(n-1,k)+k-1)%n)+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("ans= "+josephus(5,3));
	}

}
