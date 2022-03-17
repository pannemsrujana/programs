package L.E4;
Interface product{
	void values(int a,int b)
}
public class orders {

	public static void main(String[] args) {
		product p=(a,b)->{
			if(a<b)
				System.out.println(a+"accepted");
			else if(b<a)
				System.out.println(b+"not accepted");
			else
				System.out.println(a+"equal amount so not accepted");
		};
		p.values(10000,20000);

	}

}
