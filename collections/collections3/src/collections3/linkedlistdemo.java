package collections3;

import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		//cannot accessed randomly
		LinkedList<String>List=new LinkedList <String>();
		List.add("srujana");
		List.add("sruju");
        List.add("p");
        System.out.println(List);
        List.addFirst("bujji");
        System.out.println(List);
        List.add(2,"pannem");
        System.out.println(List);
        List.remove(2);
        System.out.println(List);
        List.remove("p");
        List.removeLast();
        System.out.println(List);
	}

}
