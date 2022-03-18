package java11;
Interface number{
	Public double get(double d);
}
public class simpleinterest {

	public static void main(String[] args) {
		Number principal=(d)->{
			return d;
		};
        System.out.println(rate.get(1));
        Number time=(d)->{
        	return d;
        };
        System.out.println(time.get(10));
        double interest=(principal.get(2000)*time.get(10)*rate.get(1))/100;
        System.out.println(interest);
        double amount=principal.get(2)+interest;
        System.out.println(amount);
	}

}
