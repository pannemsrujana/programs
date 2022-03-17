package lamdaexpression;

import java.util.Arrays;

public class Firstletter {

	public static void main(String[] args) {
		/*String str="hello my dear friends.";
		  char c[]=str.tochararray();
		  System.out.println("the first character of each word is:");
		  for(int i=0;i<c.length;i++){
		         if(c[i]!=''&&(i==0||c[i-1]=='')){
		         System.out.println(c[i]);
	}

}*/
String[] StrA= {"monday","tuesday","wednesday","thursday","friday","saturday"};
System.out.println(Arrays.stream(StrA)
		           .filter(Objects::nonnull)
		           .map(s->s.charAt(0))
		           .collect(collectors.toList()));
}
}