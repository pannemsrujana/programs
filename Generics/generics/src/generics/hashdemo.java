package generics;

import java.util.HashSet;
import java.util.Iterator;

public class hashdemo {

	public static void main(String[] args) {
		HashSet<employee>set=new HashSet<employee>();
		set.add(new employee("divya",101,"HR",20000));
		set.add(new employee("venkateswari",102,"IT",40000));
		set.add(new employee("suvarna",103,"ACCOUNTS",30000));
		set.add(new employee("srujana",104,"EDD",30000));
		set.add(new employee("Bujji",105,"KYC",20000));
        Iterator<employee>it=set.iterator();
        while(it.hasNext())
        {
        	employee employee=(employee)it.next();
        	System.out.println(employee);
        }
	}

}
