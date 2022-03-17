package streams;

public class fruit {
String name;
int calories;
int price;
String colour;
public fruit(String name,int calories,int price,String colour) {
	this.name=name;
	this.calories=calories;
	this.price=price;
	this.colour=colour;
}
public String toString() {
	return "fruit[name="+name+",calories="+calories+",price="+price+",colour="+colour+"]";
}
public String getname() {
	return name;
}
public int getcalories() {
	return calories;
}
public int getprice() {
	return price;
}
public String getcolour() {
	return colour;
}
}
