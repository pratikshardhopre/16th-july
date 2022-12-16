package set_Practice;

import java.util.HashSet;
import java.util.Iterator;



public class HashSet_Study {

	public static void main(String[] args) 
	{
      HashSet<Object>hs=new HashSet<>();
     
      System.out.println(hs.add(10));
      hs.add(null);
      hs.add(34);
      System.out.println(hs.add(10));
      
      hs.add("green");
      hs.add("ever");
      hs.add(null);
      
      System.out.println(hs);
      
      System.out.println(hs.size());
      System.out.println(hs.contains(10));

      System.out.println(hs.isEmpty());
      System.out.println(hs.remove(10));
      System.out.println(hs);
      
      
      for(Object h:hs)
      {
    	  System.out.println(h);
      }
      
      System.out.println("======================");
      
      Iterator<Object> it = hs.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
	}

}
