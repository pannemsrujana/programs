package collections1;

import java.util.HashSet;
import java.util.Set;

public class hashsetdemo {

	public static void main(String[] args) {
		//accessed randomly
		//null allowed
		Set<String> set=new HashSet<String>();
		set.add("srujana");
		set.add("sruju");
		set.add("bujji");
		set.add(null);
        boolean r1=set.add("srujana");
        System.out.println(r1);
        boolean r2=set.add("srujana");
        System.out.println(r2);
        System.out.println(set);
        set.contains("sruju");
        System.out.println("present");
        set.remove("sruju");
        System.out.println(set);
        for(String name : set) {
        	System.out.println(name);
        }
	}

}
