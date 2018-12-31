
public class Account {
    private int balance;
    
	public Account(int money) {
		// TODO Auto-generated constructor stub
		this.balance = money;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	public void deposit(int depositMoney) {
		// TODO Auto-generated method stub
		this.balance += depositMoney; 
	}

	public void withdraw(int withdrawMoney) {
		// TODO Auto-generated method stub
		this.balance -= withdrawMoney;
	}



}
