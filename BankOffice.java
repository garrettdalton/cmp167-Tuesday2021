import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Enter a name for the bank");
		String bankName = input.nextLine();
		System.out.println("Enter the bank's address");
		String bankAddress = input.nextLine();
		
		Bank bank = new Bank(bankName, bankAddress);
		String answer;
		
		while(true) {
			System.out.println("Do you want to open an account?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y") || answer.contains("yes") || answer.contains("yeah")) {
				while(true) {
				System.out.println("What type of account would you like to open? Enter Saving or Checking:");
				answer = input.nextLine().toLowerCase();
				if(answer.contains("saving")){
					System.out.println("Enter name of account owner:");
					answer = input.nextLine();				
					bank.openSavingAccount(answer);
				}
				else if(answer.contains("checking")) {
				System.out.println("Enter name of account owner:");
				answer = input.nextLine();				
				bank.openCheckingAcct(answer);
			}else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like to make a deposit?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y") || answer.contains("yes") || answer.contains("yeah")) {
				System.out.println("Enter name of account owner:");
				answer = input.nextLine();				
				System.out.println("Enter amount:");
				double amount = input.nextDouble();
				bank.depositMoney(answer, amount);
			}else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like to find a specific accounts info?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y") || answer.contains("yes") || answer.contains("yeah")) {
				System.out.println("Enter name of account owner:");
				answer = input.nextLine();				
				bank.findAccountInfo(answer);
			}else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Do you want to display all accounts?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y") || answer.contains("yes") || answer.contains("yeah")) {
				bank.displayAllAccts();
			}else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		System.out.println("__________________________________________________");
		System.out.println(bank);                                                                                                                                                  
	}
		}
	}
}
