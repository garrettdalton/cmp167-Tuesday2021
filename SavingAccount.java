/*
 * Extends from Account
 * Have unique attributes
 * Override the parent methods in the child class
 * 
 * 
 * https://github.com/garrettdalton/cmp167-Tuesday2021
 * 
 * 
 */



public class SavingAccount extends Account{
	public double savingsTotal;
	public double interest = 0.02;
	public int accountDuration;
	
	public void displayMonthlyInterest() {
		System.out.println("Your savings are generating an extra $" + savingsTotal * interest + " per month.");
	}
	public void displayTotalSavings() {
		System.out.println("Your account has generated a total of $" + savingsTotal);
	}
	
	@Override
	public String toString() {
		
		return "Number : " + this.number + ", Balance: " + this.balance;
	}
	

}
