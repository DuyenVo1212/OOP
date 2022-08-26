package balance;

public class OverdafAccount extends Account {
	private double overdaftLimit;

	public OverdafAccount(int id, double balance, double overdaftLimit) {
		super(id, balance);
		this.overdaftLimit = overdaftLimit;
	}

	public OverdafAccount(int id, double balance) {
		super(id, balance);
		overdaftLimit = -20;
		// TODO Auto-generated constructor stub
	}

	public double getOverdaftLimit() {
		return overdaftLimit;
	}

	public void setOverdaftLimit(double overdaftLimit) {
		this.overdaftLimit = overdaftLimit;
	}
	public void withdraw(double amount) {
		if(balance-amount>overdaftLimit) {
			setBalance(getBalance()-amount);			
		}
		else {
			System.out.println("Loi");
		}		
	}

	@Override
	public String toString() {
		return "OverdafAccount [overdaftLimit=" + overdaftLimit + "]";
	}
	
}
