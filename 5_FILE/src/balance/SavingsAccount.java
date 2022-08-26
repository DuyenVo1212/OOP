package balance;

import java.sql.Date;

public class SavingsAccount extends Account{
	private static double annuallntersestRate;
	private Date dateCreated;
	
	public SavingsAccount() {
		super();
		annuallntersestRate=0;
		dateCreated=new Date(0);
		// TODO Auto-generated constructor stub
	}


	public SavingsAccount(Date dateCreated, int id, double balance ) {
		super(id, balance);
		annuallntersestRate=0;
		this.dateCreated = dateCreated;
	}


	public static double getAnnuallntersestRate() {
		return annuallntersestRate;
	}


	public static void setAnnuallntersestRate(double annuallntersestRate) {
		SavingsAccount.annuallntersestRate = annuallntersestRate;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return annuallntersestRate/12;
	}
	
	public double getMonthlyInterset() {
		return balance*(getAnnuallntersestRate()/100);
	}
	//ham rut tien
	public void withdraw(double amount) {
		if(amount<balance) {
			setBalance(getBalance()-amount);
			
		}
		else {
			System.out.println("Loi");
		}
	}

	@Override
	public String toString() {
		return "\nAccount id: "+id +"\nDate da tao: "+getDateCreated()+
				"\nBalance: "+String.format("%.2f", balance)+ 
				"\nMonthly interest: "+ String.format("%.2f", getMonthlyInterestRate());
	}
	
}
