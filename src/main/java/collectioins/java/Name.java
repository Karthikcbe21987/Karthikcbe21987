package collectioins.java;

public class Name {
 private String first,last;
 Name(String f, String l)
 {
	 first =f;
	 last =l;
 }
 Name(){}
	 @Override public String toString () {
		 return first + " "+last;
			 
	 }
	 public static int compByLastName(Name n1, Name n2) {
		 return n1.last.compareTo(n2.last);
	 }
}
