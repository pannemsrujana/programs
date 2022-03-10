package dessert;

import java.awt.Canvas;
import java.net.CookieStore;
import java.util.Scanner;

public class Dessertshop {

	public static void main(String[] args) {
		System.out.println("Type 1 if you are the owner(or) type 2 if you are a customer");
		Scanner SC =new Scanner(System.in);
		int V=SC.nextInt();
		if(V==1)
		{
			System.out.println("Enter dessert item to be added:");
			String newitem=SC.next();
			System.out.println("Enter Quantity to be added:");
			int Stock=SC.nextInt();
			if(newitem.equalsIgnoreCase("candy"))
			{
				Candy candy=new Candy(Stock);
				System.out.println("Item added to storage");
				System.out.println("Total candy stock available now:"+candy.getstock(Stock));	
			}
			if(newitem.equalsIgnoreCase( "cookie"))
			{
				Cookie cookie=new cookie(Stock);
				System.out.println("Item added to storage");
				System.out.println("Total cookie stock available now:"+cookie.getstock(Stock));
			}
			if(newitem.equalsIgnoreCase( "Ice Cream"))
			{
				Icecream icecream=new icecream(Stock);
				System.out.println("Item added to storage");
				System.out.println("Total icecream stock available now:"+icecream.getstock(Stock));
			}
		}
		else if(V==2)
		{
			System.out.println("\n Enter your order item");
			String neworder=SC.next();
			System.out.println("Enter Quantity");
			int quantity=SC.nextInt();
			if(neworder.equalsIgnoreCase( "candy"))
			{
				candy candy=new candy(quantity);
				System.out.println("total cost in rupees="+candy.getcost());
			}
			if(neworder.equalsIgnoreCase( "cookie"))
			{
				cookie cookie=new cookie(quantity);
				System.out.println("total cost in rupees="+cookie.getcost());
			}
			if(neworder.equalsIgnoreCase( "Icecream"))
			{
				Icecream icecream=new Icecream(quantity);
				System.out.println("total cost in rupees="+icecream.getcost());
			}
		}
	}

}
abstract class Dessertitem{
	abstract int getcost();
	public static Dessertitem getinstance() {
		return null;}}abstract class candy extends Dessertitem{
			int quantity,stock;
			int availablestock=120;
			public candy(int quantity) {
				this.quantity=quantity;
			}
			public int getcost() {
				int candyprice=2;
				int candytax=10;
				return(candyprice*60*quantity+candytax);	
			}
			public int getstock(intstock)
			{
				this.stock=stock;
				return stock+availablestock;
			}
}
		class cookie extends Dessertitem{
			int quantity,stock;
			int cookiestock=150;
			public cookie(int quantity) {
				this.quantity=quantity;
			}
			public int getcost() {
				int cookieprice=3;
				int cookietax=10;
				return(cookieprice*70*quantity+cookietax);
			}
			public int getstock(int stock)
			{
				this.stock=stock;
				return stock+cookiestock;
			}
		}
            class Icecream extends Dessertitem{
            	int quantity,stock;
            	int icecreamstock=200;
            	public Icecream(int quantity) {
            		this.quantity=quantity;
            	}
            	public int getcost() {
            		int icecreamprice=50;
            		int icecreamtax=10;
            		return(icecreamprice*quantity+icecreamtax);
            	}
            	public int getstock(int stock)
            	{
            		this stock=stock;
            		return stock+icecreamstock;
            	}
            }