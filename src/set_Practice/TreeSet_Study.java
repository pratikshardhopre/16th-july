package set_Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class  TreeSet_Study
{

	public static void main(String[] args) 
	{
		 TreeSet<Object>tr=new TreeSet<>();
		// tr.add(123);
		 tr.add("Sanit");
		 tr.add("Sunil");
		 tr.add("Manju");
		 tr.add("Pratu");
		 //tr.add(234);
		 
		 //tr.add(null);
		 //tr.add(678);
		 
		 System.out.println(tr);
		 
		 System.out.println(tr.size());
	      System.out.println(tr.contains("Sanjivni"));
	      System.out.println(tr.pollFirst());
	      System.out.println(tr.pollLast());

	      System.out.println(tr.isEmpty());
	      //System.out.println(tr.remove(10));
	      System.out.println(tr);
	      
	      
	      for(Object h:tr)
	      {
	    	  System.out.println(h);
	      }
	      
	      System.out.println("======================");
	      
	      Iterator<Object> it = tr.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
		 
	}

}
