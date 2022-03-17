package streams1;

public class transaction {
String trader;
int year;
int vaue;
public transaction(String trader,int year,int value)
this.trader=trader;
this.year=year;
this.value=value;
}
public String gettrader() {
	return trader;
}
public int getyear() {
	return year;
}
public int getvalue() {
	return value;
}
public String tostring() {
	return "Transaction[trader="+trader+",year="+year+",value="+value+"]";
}