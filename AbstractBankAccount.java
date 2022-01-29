
public abstract class AbstractBankAccount {
	
	public final String BANK = "JavaBank";
	protected String accountName;
	protected int accountNum;
	protected int balance;
	
	public AbstractBankAccount(String name, int num, int amt)
    {
    	this.accountName=name;
    	this.accountNum=num;
    	this.balance=amt;
    }
	
	public AbstractBankAccount() {
		
	}
	
	public void withdraw(int amt)
    {
    	    this.balance=balance-amt;
    }
	
	public void setaccountname(String name)
    {
		this.accountName = name;
    }
	
	 public void setaccountnum(int num)
	    {
		 this.accountNum = num;
	    }
	 
	 public String getaccountname ( ) {
    	 
	    	return this.accountName;
	    }
	 
	 public int getaccountnum ( ) {
	   	 
	    	return this.accountNum;
	    }
	 
	 public int getBalance() {
			return this.balance;
		}
	 
	 public String getBankName() {
			return this.BANK;
		}
	 
	 public void setbalance(int num)
	    {
		 this.balance = num;
	    }
	 
	 public void deposit(int amt)
	    {
		 this.balance=this.balance+amt;
	    }
	 
	 public String toString() {
		return 		"\nBank Name	: " + getBankName() + 
	        		"\nAccount Holder: " + accountName + "\nAccount Number: " +
	        		accountNum + "\nBalance: " + balance;	 
	 }//end toString
	 
}//end class abstractbankaccount
