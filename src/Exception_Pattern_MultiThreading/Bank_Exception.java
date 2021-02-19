package Exception_Pattern_MultiThreading;

import java.util.Scanner;

@SuppressWarnings("serial")
class Insufficient_Balance extends RuntimeException {
	Insufficient_Balance(String s) {
		super(s);
	}
}
@SuppressWarnings("serial")
class Amount_Multiple_Hundred extends RuntimeException {
	Amount_Multiple_Hundred(String s) {
		super(s);
	}
}
public class Bank_Exception {
	public int getbalance() {
		int Available_Balance = 5000;
		return Available_Balance;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount to be Withdrawal");
		int Entered_Amount = input.nextInt();
		Bank_Exception b = new Bank_Exception();
		if (b.getbalance() < Entered_Amount) {
			if (Entered_Amount % 100 != 0) {
				throw new Amount_Multiple_Hundred("Amount should be in multiple of 100");
			} else {
				throw new Insufficient_Balance("Entered Balance not Available in the Account");
			}
		} else {
			if (Entered_Amount % 100 != 0) {
				throw new Amount_Multiple_Hundred("Amount should be in multiple of 100");
			} else {
				System.out.println("Please Collect your Amount");
			}
		}
		input.close();
	}
}
