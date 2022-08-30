package linkedList;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
         
    }
    
}
public class RotateAArray {
	static void print(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	 public Node rotate(Node head, int k) {
	     int count=0;
	     Node temp=head;
	     Node start=null;
	     Node pre=null;
	     if(head==null)return head;
	     
	     while(temp.next!=null)
	     {
	          count++;
	         pre=temp;
	         temp=temp.next;
	         if(count==k){
	           start=temp;
	           pre.next=null;
	         }
	        
	     
	     }
	     if(count+1==k)
	     return head;
	     temp.next=head;
	     
	      return start;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
