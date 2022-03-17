package collections2;

import java.util.Set;
import java.util.TreeSet;

public class treesetdemo {

	public static void main(String[] args) {
		//accessed in natural order
		//null not allowed
		Set<String>set=new TreeSet<String>();
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("c");
		System.out.println(set);
		boolean r1=set.add("srujana");
		System.out.println(r1);
		boolean r2=set.add("srujana");
		System.out.println(r2);
		System.out.println(set);
		set.contains("a");
		System.out.println("present");
		set.remove("a");
        System.out.println(set);
        for(String name : set) {
        	System.out.println(name);
        }
	}

}
