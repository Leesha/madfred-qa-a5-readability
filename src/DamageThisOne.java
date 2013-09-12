import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author ALEEESHER
	 * @version 1.0
	 * @date August 12, 20210
	 * @param void
	 */
	
	public static void main(String[] args) {
		//declaring something im not sure. i thought damaging was going to be easier then fixing ha! 
		// i hope the person is purchasing tickets to go to jamaca. cus i want to go :P
		int ticketNumber, stem, checkDigit;
		Scanner braceYourSelf = new Scanner(System.in);
		System.out.print("Please enter a six-digit ticket number: ");
		ticketNumber = braceYourSelf.nextInt();
		stem = ticketNumber / 7;checkDigit = ticketNumber % 10;	

		//checking to see if you know how to enter the correct amount of nymberz!
		while (checkDigit != stem % 7) {
			System.out.println("That is NOT a valid ticket number, dumb dumb!");System.out.print(" Do Try again: ");
			ticketNumber = braceYourSelf.nextInt();stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;	
		}
						
		System.out.println("That is a valid ticket number, well done!");
	
	}

}
