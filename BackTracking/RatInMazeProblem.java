package BackTracking;

public class RatInMazeProblem {
       static boolean rat(int a[][], boolean[][] visit, int i, int j)
       {
    	   //Base condition
    	   if(i>=a.length || j>=a.length || a[i][j]==0 || visit[i][j])
    		   return false;
    	   //Base condition for destination
    	   if(i==a.length-1 && j==a.length-1)
    		   return true;
    	   //suppose cell is visited
    	   visit[i][j]=true;
    	   //check if there is a path possible for down
    	   if(rat(a,visit,i+1,j))
    		   return true;
    	   //check there is a path possible for right
    	   if(rat(a,visit,i,j+1))
    		   return true;
    	   //unvisited or backtrack
    	   visit[i][j]=false;
    	   //baxktrack
    	   return false;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{1,0,0,0},
                   {1,1,0,1},
                   {1,1,0,0},
                   {0,0,1,1} };
          boolean visit[][]=new boolean[a.length][a.length];
         boolean count=rat(a,visit,0,0);
          System.out.println(count);
	}

}
