package shapes;

abstract class shape{
	abstract void draw();
	
}
class Line extends shape{
     public void draw() {
    	 System.out.println("this is a line");
     }
}
class Rectangle extends shape{
      public void draw() {
    	  System.out.println("this is arectangle");
      }
}
class cube extends shape{
	   public void draw() {
		   System.out.println("this is a cube");
	   }
}