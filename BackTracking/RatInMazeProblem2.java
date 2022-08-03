package BackTracking;

import java.util.ArrayList;

public class RatInMazeProblem2 {
      public static void rat(int arr[][],boolean[][] visit,int i,int j,String s,ArrayList<String> al)
      {
    	 if(i>=arr.length ||j>=arr[0].length||i<0 ||j<0)
    		 return;
    	 if(i==arr.length-1 && j==arr[0].length-1)
    	 {
    		 al.add(s);
    		 return;
    	 }
    	 if(arr[i][j]==0 || visit[i][j])
    		 return;
    	 visit[i][j]=true;
    	 rat(arr,visit,i+1,j,s+"D",al);
    	 rat(arr,visit,i,j+1,s+"R",al);
    	 visit[i][j]=false;
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][]= {{1,0,0,0},
                    {1,1,0,1},
                    {1,1,0,0},
                    {0,1,1,1} };
        boolean visit[][]=new boolean[a.length][a.length];
        ArrayList<String> al=new ArrayList<>();
       rat(a,visit,0,0,"",al);
       System.out.println(al);

	}

}
