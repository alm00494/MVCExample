
public class Account extends AbstractBankAccount {

	// class variables
	    private static int bonusValue;
	    private AccountType type;
	    
	    //default constructor for Account
	    
	    public Account(String name, int num, int amt, AccountType type) {
			super(name, num, (amt + calculateInitialBonusValue(amt)));
			//bonusValue = calculateInitialBonusValue(amt);//i didnt have this line in and it was working fine but the slides show this line so i added it on 25.10.21
			this.type = type; 
		}//end constructor
	    
	    public Account() {
	    	
		}//end constructor
	    
	    public static int calculateInitialBonusValue(int amt) {
	    	bonusValue = 0;
	    	if(amt >=1 && amt <= 100)
	    		bonusValue=10;
	    	else if(amt >100 && amt <= 300)
	    		bonusValue=20;
	    	else if(amt >300)
	    		bonusValue=30;
	    	return bonusValue;
	    }//end calculateInitialBonusValue
	    
	    public void deposit(int amt) {
	    	if(amt>100)
	    		balance=balance+(amt + (int)(bonusValue * 0.1));
	    	else
	    		balance=balance+amt;
	    }//end deposit

		//print method 
	    public void print() {
	        System.out.println("\nBank Name	:	" + getBankName() + 
	        		"\nAccount Holder:	" + accountName + "\nAccount Number:	" +
	        		accountNum + "\nBalance:	" + balance);
	      }
	    
	    public String toString() {
	    	return "\nAccount type: " + this.type 
	    			+ super.toString();
	    	
	    }//end toString

	}//end class
