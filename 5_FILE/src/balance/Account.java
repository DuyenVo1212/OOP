package balance;

public class Account {
	protected int id;
	protected double balance;
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public Account() {
		this(0,0);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//ham rut va nap tien
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
		
	
}
