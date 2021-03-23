package collectioins.java;
import java.util.*;

public class Map_Hash_Map {
	
	public static void main (String args[]) {
		HashMap<Integer,String> hs=new HashMap <Integer,String>();
		hs.put(1, "Mango");
		hs.put(2, "Orange");
		hs.put(3,"Grapes");
		hs.put(4, "Banana");
		hs.put(2, "WATERMELON");
		for(Map.Entry m:hs.entrySet()) {
			System.out.println(m.getKey() +"     "+m.getValue());
		}
		System.out.println(hs.get(4));
		//System.out.println(hs.getClass());
	}

}
