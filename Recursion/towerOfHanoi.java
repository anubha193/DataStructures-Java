package Recursion;

public class towerOfHanoi {
      public static long tower(int n,char from,char aux,char to)
      {
    	  if(n == 1){
              System.out.println("move disk "+ n + " from rod "+ from + " to rod " + to );
              return 1;
          }
          long i = tower(n-1, from, aux, to); 
          System.out.println("move disk "+ n + " from rod "+ from + " to rod " + to);
          i = i + tower(n-1, aux, to, from);
          
          
          return i + 1;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(tower(3,'A','B','C'));
	}

}
