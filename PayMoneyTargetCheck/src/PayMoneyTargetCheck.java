import java.util.Scanner;

public class PayMoneyTargetCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numOfTransactions = 0;
		int transactionArray[];
		int numOfTargets = 0;
		
		System.out.println("enter the size of transaction array:");
		numOfTransactions = sc.nextInt();
		transactionArray = new int[numOfTransactions];
		
		System.out.println("enter the values of array one by one:");
		for (int i = 0; i < numOfTransactions; i++) {
			transactionArray[i] = sc.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved:");
		numOfTargets = sc.nextInt();

		for (int i = 0; i < numOfTargets; i++) {
			System.out.println("enter the value of target:");
			int Target = sc.nextInt();
			
			// check if target possible
			int transactionSum = 0;
			int totaltransactionsRequired = 0;
			
			while ((transactionSum < Target) && (totaltransactionsRequired < numOfTransactions)) {
				transactionSum += transactionArray[totaltransactionsRequired++];
			}
			
			if (transactionSum >= Target) {
				System.out.println("Target achieved after " + totaltransactionsRequired + 
						" transactions\n");
			} else {
				System.out.println("Given target is not achieved\n");
			}
		}
		sc.close();
	}

}
