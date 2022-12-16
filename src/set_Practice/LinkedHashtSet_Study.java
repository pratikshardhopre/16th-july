package set_Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashtSet_Study {

	public static void main(String[] args) 
	{
		LinkedHashSet<Object>li=new LinkedHashSet<>();
		li.add("Plane");
		li.add(12);
		li.add(null);
		li.add(12);
		li.add(34);
		li.add(true);
		li.add("False");
		li.add(null);
		
		System.out.println(li);
		
		 System.out.println(li.size());
	      System.out.println(li.contains(10));

	      System.out.println(li.isEmpty());
	      System.out.println(li.remove(10));
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
