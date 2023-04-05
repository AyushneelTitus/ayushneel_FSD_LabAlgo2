import java.util.Scanner;

public class DenominationChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sizeOfCurrencyDenomination = 0;
		int currencyDenominations[];
		int amount = 0;
		
		System.out.println("enter the size of currency denominations:");
		sizeOfCurrencyDenomination = sc.nextInt();
		currencyDenominations = new int[sizeOfCurrencyDenomination];

		System.out.println("enter the currency denominations values one by one:");
		for(int i = 0; i < sizeOfCurrencyDenomination; i++) {
			currencyDenominations[i] = sc.nextInt();
		}
		sort(currencyDenominations);
		
		System.out.println("enter the amount you want to pay");
		amount = sc.nextInt();
		
		
		for(int index = 0; index < sizeOfCurrencyDenomination; index++) {
			if(amount == 0) {
				break;
			}
			
			int numOfNotes = amount / currencyDenominations[index];
			amount = amount % currencyDenominations[index];
			if(numOfNotes > 0) {
				System.out.println(currencyDenominations[index] + ":" + numOfNotes);
			}
		}
		if(amount > 0) {
			System.out.println("You are short by amount " + amount);
		}
		
		sc.close();
	}
	
	private static void sort(int[] arr) {
		//selection sort descending order
		for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[index]){
                    index = j;
                }
            }
            int largerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = largerNumber;
        }
	}

}
