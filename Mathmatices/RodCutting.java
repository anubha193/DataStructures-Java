package Mathmatices;

import java.util.Arrays;

public class RodCutting {
	static int cut(int n,int a,int b,int c,int[] dp)
	{
		if(n==0)
			return dp[n]=0;
		if(n<0)return -1;
		if(dp[n]!=-2) return dp[n];
		int cuta=cut(n-a,a,b,c,dp);
		int cutb=cut(n-b,a,b,c,dp);
		int cutc=cut(n-c,a,b,c,dp);
		int res= Math.max(cuta,Math.max(cutb,cutc));
		if(res==-1)return dp[n]=-1;
		return dp[n]=res+1;
	}
	static int cutting(int n,int a,int b,int c)
	{
		if(n==0)
			return 0;
		if(n<0)return -1;
		int cuta=cutting(n-a,a,b,c);
		int cutb=cutting(n-b,a,b,c);
		int cutc=cutting(n-c,a,b,c);
		int res= Math.max(cuta,Math.max(cutb,cutc));
		if(res==-1)return -1;
		return res+1;
		
	}
		public static void main(String[] args) {
			int n=25;
        System.out.println(cutting(n,6,7,13));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-2);
        System.out.print(cut(n,6,7,13, dp));
	}

}
