package junit;

public class integerutils {
public static int Maxvalue(int[] a) {
	int value=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]>value) {
			value=a[i];
		}
	
	}
	return value;
}
public static int MinValue(int[] a) {
	int value=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]<value) {
			value=a[i];
		}
	}
	return value;	
}

}
