/*
 * Extends from Account
 * Have unique attributes
 * Override the parent methods in the child class
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

}
