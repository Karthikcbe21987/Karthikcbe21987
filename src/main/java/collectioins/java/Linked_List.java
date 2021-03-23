package collectioins.java;

import java.util.*;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class Linked_List {

	public static void main(String args[]){
		LinkedList <String> ll = new LinkedList<String>();
		ll.add("Sai");
		ll.add("Sunandha");
		ll.add("Karthik");
		ll.add("Sai");
		ll.add("Sunandha");
		ll.add("Sai");
		ll.add("Thanvika");
		Collections.sort(ll);
		Collections.reverse(ll);
				for (String s:ll) {
			System.out.println(s);
			
		}
				System.out.println(ll.get(1));
				System.out.println(ll.isEmpty());
				System.out.println(ll.contains("Karthik"));
	}
}
