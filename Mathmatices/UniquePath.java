package Mathmatices;

public class UniquePath {

	public static int unique(int m,int n)
	{
        m--;n--;
        
        if(n<m){
           int temp=n;
            n=m;
            m=temp;//taking least value in m variable
        }
        double ans=1.0;
        for(int i=1;i<=n;i++){
            ans=(ans*(m+i)/i);//we are finding ncr here n=n+m,r=n
        }
        return (int)ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(unique(3,7));
	}

}
