package Mathmatices;

public class FirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         	int n=12;
         	int count=0;
         	countPos(n);
         	//System.out.println(count);
	}
	static void countPos(int n)
	{
		int count=1;
		while(n!=0)
		{
			if((n&1)==1)
			{
				System.out.println(count);
				break;
			}
			count++;
			n=n>>1;
		}
	}

}
