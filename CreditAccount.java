
public class CreditAccount extends AbstractBankAccount{

	private int creditLimit;
	
	//overloaded constructor for CreditAccount
	CreditAccount(String name, int num,int amt)
    {
            super(name,num,amt);
            this.creditLimit=calculateCreditLimit(amt);
            
    }
	
	public CreditAccount() {

	}

	public static int calculateCreditLimit(int amt) {
		if(amt >=1 && amt <= 2000)
    		return 100;
    	else if(amt >2000 && amt <= 4000)
    		return 200;
    	else
    		return 300;
    }//end calculateInitialBonusValue
	
	
	//modifier to set the account creditlimit
	 public void setcreditlimit(int num)
	    {
	    	    creditLimit = num;
	    }
	//accessor to get the account creditlimit
	 public int getcreditlimit ( ) {
	   	 
	    	return creditLimit;
	    }
	 //print method 
	 public void print() {
	        System.out.println("\nBank Name	: " + getBankName() + 
	        		"\nAccount Holder:	" + accountName + "\nAccount Number:	" +
	        		accountNum + "\nBalance:	" + balance + "\nCredit Limit:	" + creditLimit);
	      }
	 
	 public void deposit(int amt)
	    {
		 balance=balance+amt;
	    }
	 
	 public String toString() {
		 return super.toString() + "\nCredit Limit: " + creditLimit;
	 }
}
