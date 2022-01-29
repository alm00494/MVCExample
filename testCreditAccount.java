
public class testCreditAccount {
	

	public static void main(String[] args) {
	    
		Account A1 = new Account("Sanjay Gupta", 31511556,100, AccountType.SAVINGS);
		Account A2 = new Account("He Xai", 22301048, 300, AccountType.SAVINGS);
		Account A3 = new Account("Ilya Mustafana", 42210021, 500, AccountType.SAVINGS);
		
		// Using constructor with values which will call constructor from super
		CreditAccount C1 = new CreditAccount("A. Nother",66778,1000);
		CreditAccount C2 = new CreditAccount("A. N. Other",88776,5000);

		
		// Print accounts
		//A1.print();
		//A2.print();
		//A3.print();
		//C1.print();
		//C2.print();
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(C1);
		System.out.println(C2);
    }
}

