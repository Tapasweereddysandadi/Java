class InsufficientException extends Exception{
	public InsufficientException(String msg){
		super(msg);
	}
}
class Bank {
	int balance = 1000;
	public synchronized void deposit(int money){
		balance = balance + money;
		System.out.println("balance :" + balance);
	}
	public synchronized void withdraw(int money) throws InsufficientException{
		if(money > balance){
			throw new InsufficientException("Insufficient Balance");
		} else {
			balance = balance - money;
			System.out.println("Balance :" + balance);
		}
	}
}	
class customer implements Runnable{
	Bank b;
	public customer(Bank b){
		this.b = b;
		Thread t = new Thread(this);
		t.start();
	}
	public void run(){
		try{
			b.withdraw(100);
			b.withdraw(500);
			b.withdraw(400);
			b.withdraw(200);
		}catch(InsufficientException e){
			System.out.println(e.getMessage());
		}
	}
}
class bankEx{
	public static void main(String args[]){
		Bank b = new Bank();
		new customer(b);
		new customer(b);
	}
}	
		