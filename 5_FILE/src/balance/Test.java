package balance;

public class Test {
	public static void main(String[] args) {
		Account account=new Account(1212,2000);
		SavingsAccount savingsAccount=new SavingsAccount();
		//SavingsAccount savingsAccount=new SavingsAccount(4.5,1001,2000);
		OverdafAccount overdafAccount=new OverdafAccount(10, 10004,2000);
		account.withdraw(2500);
		savingsAccount.withdraw(2500);
		overdafAccount.withdraw(2500);
		account.deposit(3000);
		savingsAccount.deposit(3000);
		overdafAccount.deposit(3000);
		
		System.out.println(account.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(overdafAccount.toString());
	}
}
