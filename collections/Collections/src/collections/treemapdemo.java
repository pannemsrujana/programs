package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treemapdemo {

	public static void main(String[] args) {
		Map<String,Integer>map=new TreeMap<>();
        map.put("a",1);
        map.put("c",2);
        map.put("d",3);
        map.put("b",4);
        System.out.println("size"+map.size());
        System.out.println(map);
        if(map.containsKey("a")) {
        	Integer a=map.get("a");
        	System.out.println("value of key"+"\"a\" is "+a);
        	 }
        for(String key:map.keySet()) {
        	System.out.println("key:"+key+",value:"+map.get(key));
        }
        for(Entry<String,Integer>entry:map.entrySet()) {
        	System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
	}

}
