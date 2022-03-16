package Generics1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class hashmapdemo {

	public static void main(String[] args) {
		//
		//create a hashtable and put some key-Integerair.
		//
		HashMap<integer, Double> values=new HashMap<integer, Double>();
		values.put(10,9.7);
		values.put( 9,2.7);
		values.put(8, 3.5);
		values.put(7, 0.56);
		values.put(6,9.3);
		values.put(5,5.7);
		values.put(4,8.7);
		values.put(3,3.5);
		values.put(2,7.56);
		values.put(1,6.3);
       //Get a random entry from the hashmap.
		Object[] keys=values.keySet().toArray();
		Object key=keys[new Random().nextInt(keys.length)];
		System.out.println("random value"+key+"::"+ values.get(key));
		List<Entry<integer,Double>>list=new ArrayList<Entry<integer,Double>>(values.entryset());
		for(Entry<integer, Double> entry:list) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}

}
