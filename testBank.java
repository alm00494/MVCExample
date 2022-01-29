
public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta", 31511556,100, AccountType.SAVINGS);
	Account A2 = new Account("He Xai", 22301048, 300, AccountType.SAVINGS);
	Account A3 = new Account("Ilya Mustafana", 42210021, 500, AccountType.SAVINGS);

	// Print accounts
	A1.print();
	A2.print();
	A3.print();
	
	System.out.println(A1);
	System.out.println(A2);
	System.out.println(A3);
	

}
}
