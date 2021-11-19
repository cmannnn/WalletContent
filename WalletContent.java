package test;
/*
 * The Java class you create must include at least 2 attributes, a constructor, and at least 1 method
 * TO DO: create coupon values, create credit card value
 */
/*
 * ADDITION: spend cash? use credit card? calculate new value of the wallet based on transactions 
 */



public class WalletContent {
	//class attributes
	private int cashAmount;       // amount of cash in the wallet
	private int couponAmount;     // value of coupons in the wallet
	private int creditLine;       // value of credit card in the wallet
	private int creditBalance;
	private int availableCredit;
	private int totalValue;       // total value of the wallet
	
	// constructor takes the amount in cash (cashAmount)
	// public WalletConent(int cash, int coupon ...)
	public WalletContent(int cashAmount, int couponAmount, int creditLine, int creditBalance) {
		totalValue = 0;
		this.cashAmount = cashAmount;
		//cashAmount = a;
	}

	//getters
	public int getCashAmount() {
		return cashAmount;
	}
	
	public int getCouponAmount() {
		return couponAmount;
	}
	
	public int getCreditLine() {
		return creditLine;
	}
	
	public int getCreditBalance() {
		return creditBalance;
	}
	
	public int getTotalValue() {
		return totalValue;
	}
	
	// setters
	// adds the cash amount to totalValue
	public void setCashAmount(int cashAmount) {
		totalValue = totalValue + cashAmount;
	}
	
	// adds the coupon amount to totalValue
	public void setCouponAmount(int couponAmount) {
		totalValue = totalValue + couponAmount;
	}
	
	// calculates availableCredit and adds it to the totalValue
	public void setCreditBalance(int creditLine, int creditBalance) {
		availableCredit = creditLine - creditBalance;
		totalValue = totalValue + availableCredit;
	}
	
	// prints the value of the wallet
	public void calculate() {
	    if (totalValue <= 0) {
		    System.out.println("You got nothing!");
			System.out.println("Your wallet is worth: $" + totalValue);
		}
	    
	    if (totalValue > 0 && totalValue < 100) {
	    	System.out.println("You have a few dollars");
        	System.out.println("Your wallet is worth: $" + totalValue);
	    }
	    
	    if (totalValue > 100 && totalValue < 500) {
	    	System.out.println("You have a couple hundred dollars");
        	System.out.println("Your wallet is worth: $" + totalValue);
	    }
	    
        if (totalValue > 500 && totalValue < 1000) {
        	System.out.println("You have multiple hundred dollars");
        	System.out.println("Your wallet is worth: $" + totalValue);
        }
        
        if (totalValue > 1000 && totalValue < 5000) {
        	System.out.println("You have a couple thousand dollars");
        	System.out.println("Your wallet is worth: $" + totalValue);
        }
        
	    if (totalValue > 5000 && totalValue < 10000) {
	    	System.out.println("Ok now we're talking...You have multiple thousand dollars");
	    	System.out.println("Your wallet is worth: $" + totalValue);
	    }
        
	    else if (totalValue > 10000) {
	    	System.out.println("(o_O)");
	    	System.out.println("Your wallet is worth: $" + totalValue);
        }
	}
}