package overloading;

public class childlevelextendschildclass {

	public void getdata(int a)
	{
		System.out.println(a);
	}
	public void getdata(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    childlavel cl=new childlavel();
    cl.getdata(2);
    cl.getdata("Hello");
	}

}
