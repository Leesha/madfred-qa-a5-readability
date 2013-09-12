import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) 
	{
		//these two constants hold a set value to be calculated
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		// these hold the vairables
		int eggs;
		int d;
		int s;
		float dozensCost, singlesCost, tc;
		Scanner sc = new Scanner(System.in);
		
		//prompting the user for input, 
		System.out.println("How many eggs would you like to purchase?: ");
		eggs = sc.nextInt();
		d = eggs / 12;
		s = eggs % 12;
		//this calculates the users input with the set price/ and the total cost at the end of the bill.
		dozensCost = d * PRICE_PER_DOZEN;
		singlesCost = s * PRICE_PER_SINGLE;
		tc = dozensCost + singlesCost;
		
		
		//this is the section that outputs the bill of sale, in full description 
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + d + " dozen at $3.25, or $" + dozensCost);
		System.out.println("That's " + s + " singles at 45c, or $" + singlesCost);
		System.out.println("Your total cost is $" + tc);
		
	
	}

}
