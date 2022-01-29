
public class TestCustomerAccounts {
	
	public static void main(String[] args) {
		
		AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];
		
		//instantiate 2 bank accounts using constructor
		bankAccount[0] = new Account("Sanjay Gupta", 31511556,100, AccountType.SAVINGS);
		bankAccount[1] = new Account("He Xai", 22301048, 300, AccountType.SAVINGS);
		bankAccount[2] = new Account("Ilya Mustafana", 42210021, 500, AccountType.SAVINGS);
		
		//instantiate 2 credit accounts using constructor
		bankAccount[3] = new CreditAccount("A. Nother",66778,1000);
		bankAccount[4] = new CreditAccount("A. N. Other",88776,5000);
		showAllCustomerAccounts(bankAccount);
		showAllAccounts(bankAccount);
		showAllCreditAccounts(bankAccount);
	}//end main
	
	public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Customer Accounts******");
		for(AbstractBankAccount act: bankAccount)
			System.out.println(act);
		//end enhanced for
	}//end showAllCustomerAccounts
	
	public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Account Types******");
		for(AbstractBankAccount act: bankAccount)
			if(act instanceof Account)
				System.out.println(act);
		//end enhanced for
	}//end showAllAccounts
	
	public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount) {
		System.out.println("\nAll Account Types******");
		for(AbstractBankAccount act: bankAccount)
			if(act instanceof CreditAccount)
				System.out.println(act);
		//end enhanced for
	}//end showAllAccounts
	
}//end class 
