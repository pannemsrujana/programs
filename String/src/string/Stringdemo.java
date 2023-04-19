package string;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="welcome to capgemini";
        System.out.println(a);
        System.out.println(a.charAt(19));
        System.out.println(a.indexOf(19));
        System.out.println(a.substring(1, 19));
        System.out.println(a.substring(19));
        System.out.println(a.concat("\tsrujana amma"));
        a.length();
        System.out.println(a.trim());
        a.toUpperCase();
        a.toLowerCase();
        //split
        String arr[]=a.split("ii");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t","i"));
        
	}

}
