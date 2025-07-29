package com.tns.kprit.interfacedemo;

public class BankImple implements Bank{

	double balance=1000;
	//double amount;
	
	@Override
	public void withdraw(double amount) {
          if(amount>0&&amount<=balance) {
        	  double bal=balance-amount;
        	  System.out.println("Balnace after withdraw"+bal);
          }
          else
        	  System.err.println("Insufficient balance");
		
	}

	@Override
	public void deposit(double amount) {
		if(amount<25000) {
			double bal=amount+balance;
			System.out.println("Amount after deposit"+bal);
		}
		else {
      	  System.err.println("deposit limit exceeds");

		}
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
