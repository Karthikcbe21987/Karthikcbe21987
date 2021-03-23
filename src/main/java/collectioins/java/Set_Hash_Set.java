package collectioins.java;
import java.util.*;
public class Set_Hash_Set {
	
	public static void main(String args[]) {
	HashSet <String> hs = new HashSet<String>();
	hs.add("Sai");
	hs.add("Darshith");
	hs.add("Sai");
	hs.add("Sunandha");
	hs.add("Karthik");
	hs.add("Aji");
	hs.add("Karthik");
	hs.add("Appa");
		for (String a : hs) {
		System.out.println(a);
	}
		//System.out.println(hs.getClass());
		System.out.println(hs.isEmpty());
		System.out.println(hs.hashCode());
		System.out.println(hs.addAll(hs));
	
	}

}
