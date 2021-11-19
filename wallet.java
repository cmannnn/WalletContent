package test;

import java.util.Scanner;

public class wallet {
	public static void main(String[] args) throws InterruptedException {
		// welcome message
		final String WELCOME = "|  |   /\\    |      |     ___  ___ \n"
      				 + "|  |  ----   |      |     |__   |         \n"
    		         + "|/\\| /    \\  |___   |___  |__   |       \n";
	   System.out.print(WELCOME);
	   
	   // initiating Scanner
	   Scanner scnr = new Scanner(System.in);
       
	   // creating a wallet for us to value
       WalletContent walletContent;
       
       System.out.println("Ready to begin?");
      
       // sleeping for 2 seconds
       String ready[] = {"..."};
       for (int i = 0; i < ready.length; i++) {
    	   Thread.sleep(2000);
    	   System.out.println(ready[i]);
       }
      
       // any cash?
       System.out.println("How much cash do you have in your wallet?");
       int cashAmount = scnr.nextInt();
            
       // any coupons?
       System.out.println("What is the value of any coupons in your wallet?");
       int couponAmount = scnr.nextInt();
      
       // determine credit line
       System.out.println("What is the credit line on your credit card?");
       int creditLine = scnr.nextInt();
      
       // determine credit card balance
       System.out.println("What is the balance on your credit card?");
       int creditBalance = scnr.nextInt();
      
       // initiate walletContent
       walletContent = new WalletContent(cashAmount, couponAmount, creditLine, creditBalance);
      
       
       /*
        * TO DO: DO NOT NEED TO "SET" THESE VARIABLES, SHOULD BE DONE AUTOMATICALLY AND THEN
        * JUST CALL .CALCULATE()
        */
       walletContent.setCashAmount(cashAmount);
       walletContent.setCouponAmount(couponAmount);
       walletContent.setCreditBalance(creditLine, creditBalance);
       walletContent.calculate();
   }
}
