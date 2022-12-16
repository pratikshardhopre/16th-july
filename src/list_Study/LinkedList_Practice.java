package list_Study;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Practice {

	public static void main(String[] args) 
	{
		LinkedList<Object>li=new LinkedList<>();
		
		li.add("Motive");
		li.add(21);
		li.add(null);
		li.add("Honest");
		li.add(34);
		li.add(false);
		li.add(21);
		
		System.out.println(li);
		
		 System.out.println(li.size());
	      System.out.println(li.contains("Sanjivni"));
//	      System.out.println(li.poll());
//	      System.out.println(li);
//	      System.out.println(li.pop());
//	      System.out.println(li);
	      System.out.println("==========");
	      System.out.println(li.peek());
	      System.out.println("==========");
	      li.push("Mumbai");
	      System.out.println(li);
	      //System.out.println(li.pollLast());

	      System.out.println(li.isEmpty());
	      //System.out.println(tr.remove(10));
	      System.out.println("---------------");
	      System.out.println(li.offer("Motive"));
	      System.out.println(li);
	      
	      
	      for(Object h:li)
	      {
	    	  System.out.println(h);
	      }
	      
	      System.out.println("======================");
	      
	      Iterator<Object> it = li.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
		 
		

	}

}
