package lamdaexpression2;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class Stringlength {
	InterfaceAddress Stringlength{
		int getlength(String str) {
			return 0;
		}
	}

	public static void main(String[] args) {
		
     ArrayList<String>strl=new ArrayList<>(Arrays.asList("srujana","sruju","bujji","janu"));
     strl.removeIf((String str)->str.length()%2==1);
     System.out.println(strl);
	}

}
