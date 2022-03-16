package Generic5;

import java.sql.Date;
import java.util.HashMap;

public class pairB {

	public static void main(String[] args) {
		//creating an object
		HashMap<String,Date>hm=new HashMap<String,Date>();
		//adding key-value pair
		hm.put("today is",(Date) new java.util.Date());
		System.out.println(hm);

	}

}
