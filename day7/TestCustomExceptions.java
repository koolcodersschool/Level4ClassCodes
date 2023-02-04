package day7;

public class TestCustomExceptions {
	
	public static void main(String[] args) throws BreakTimeException {
		
		//throw new InsufficientFundsException("Funds Insufficient!!! Pay attention!!!");
		
		double balance = 2000.00;
		double price = 1500.00;
		String itemName = "TV";
		
		if(price > balance) {
			throw new InsufficientFundsException("There is NOT enough money in your bank account"
					+ " in order to make this transaction.");
		}else {
			balance = balance - price;
			//balance -= price;
			System.out.println("Transaction was successful!!! Enjoy your new " + itemName);
			System.out.println("Remaining balance is: " + balance);
		}
		
		
		int time = 7;
		
		if(time == 7) {
			throw new BreakTimeException("Break is 7 minutes");
		}else {
			System.out.println("Keep coding Java");
		}
		
	}

}
