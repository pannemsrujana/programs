package Generic2;

public class exchangepositions {
	public static final<T>void swap(T[]a,int i,int j){
		T t=a[i];
		a[i]=a[j];
		a[j]=t;
	}

	public static void main(String[] args) {
		Integer[]a= {1,5,3,7};
		swap(a,1,2);
		for(Integer i:a)
		{
			System.out.println(i+ "");
		}
       
	}

}
