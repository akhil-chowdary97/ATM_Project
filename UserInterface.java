package ATM;

import java.util.Scanner;

public class UserInterface {

	private static int status;

	public static void main(String[] args) {
		
		ATMOperationImpl impl = new ATMOperationImpl();
		Scanner scan = new Scanner(System.in);
		
		int atmnumber =123456;
		int atmpin =9912;
		System.out.println("Welcome to our ATM");
		System.out.println("Enter your ATM number");
		int atmnumber2=scan.nextInt();
		System.out.println("Enter your ATM pin");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnumber2 && atmpin==atmpin2) {
			
			while(true) {
				System.out.println("1. Check Balance \n2. Withdraw Amount \n"
						+ "3. Deposit Amount \n4. Mini Statement \n5. Exit");
				
				System.out.println("Choose the option:");
				int choice=scan.nextInt();
				if(choice==1) {
					impl.viewBalance();
				}
				else if(choice==2) {
					System.out.println("Enter withdraw amount");
					double withdrawamount=scan.nextDouble();
					impl.withdrawAmount(withdrawamount);
				}
				else if(choice==3) {
					System.out.println("Enter deposit amount");
					double depositamount=scan.nextDouble();
					impl.depositAmount(depositamount);
				}
				else if(choice==4) {
					System.out.println("This is your mini statement");
					impl.viewMiniStatement();
				}
				else if(choice==5)
				{
					System.err.println("Collect your ATM card \nThank you for visiting");
					System.exit(status);

				}
			}
				
		}
		else {
			System.out.println("Incorrect ATM number or ATM pin");
		}
		

	}

}
