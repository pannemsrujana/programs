package inheritance1;

public class childextendsparent {

	String name="SrujanaAcadamy";
	private childextendsparent Super;
	public void child()
	{
		Super();
		System.out.println("child class constructor");
	}
	private void Super() {
		// TODO Auto-generated method stub
		
}
	public void getstringdata()
	{
		System.out.println(name);
		System.out.println("super.name");
	}
	public void getdata()
	{
		Super.getdata();
		System.out.println("iam in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      child c=new child();
      c.getstringdata();
      c.getdata();
	}

}
