package stream3;

public class trader {
String name;
String city;
public trader(String name,String city) {
	this.name=name;
	this.city=city;
}
public String getname() {
	return name;
}
public String getcity() {
	return city;
}
public String toString() {
	return "trader[name="+name+",city="+city+"]";
}
}
