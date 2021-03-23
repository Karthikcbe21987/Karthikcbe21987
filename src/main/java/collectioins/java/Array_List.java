package collectioins.java;

import java.util.*;
public class Array_List {

	public static void main(String args[]) {
		ArrayList  <String>s1=new ArrayList<String> ();
		s1.add("Sai");
		s1.add("Darshith");
		s1.add("Sai");
		s1.add("Sunandha");
		s1.add("Karthik");
		s1.add("Sai");
	
		//-----------------Using Iterator--------------//
	/*Iterator itr = s1.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());*/
		
	//--------------Using For Loop------------//
		
		/*for(int i=0; i<=s1.size()-1;i++) {
		System.out.println(s1.get(i));
		
	}*/
		
		//------------Using ForEach--------//
	for (String s:s1)	
	{
		System.out.println(s);
	}
	}
	
}
