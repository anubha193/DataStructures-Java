package simpleJavaProgram;
import java.util.*;
public class ArraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> all=new ArrayList<>();
		all.add(1);
		all.add(2);
		all.add(3);
		al.add(all);
		all.clear();
		all.add(4);
		all.add(5);
		all.add(6);
		al.add(all);
		System.out.println(al);

	}

}
