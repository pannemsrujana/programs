package exceptions3;

import javax.naming.InsufficientResourcesException;

public class userdefined {

	long id;
	double balance;
	double withdraw;
	public userdefined(long id,double balance) throws InsufficientbalanceException,illegalbanktransactionecxception{
		this.id=id;
		this.balance=balance;
	}
	public long getid() {
		   return id;
	}
	public void setid(long id) {
		this.id=id;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public void withdraw(int amt) throw insufficientfundsexception{
		if(amt<=balance) {
			balance -=amt;
		}
		else {
			int newbalance=(int)(amt -balance)
					throw new insufficientfundsexception(newbalance);
		}
	}
	public static void main(String[] args) throws InsufficientbalanceException, illegalbanktransactionecxception{
		
		userdefined ac=new userdefined(1234, 10000);
		try {
			ac.withdraw(15000);
			System.out.println("Successful transaction");
		}catch(insufficientfundsexception e)
		{
			System.out.println("insufficientfundsexception");
		}
	}

}
