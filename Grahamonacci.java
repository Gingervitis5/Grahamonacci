import java.util.*;
import java.io.*;

public class Grahamonacci {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner ns = new Scanner(new File("Grahamonacci.in"));
		int numTests = ns.nextInt(); ns.nextLine();
//		Counting the number of tests left to do
		for (; numTests > 0; numTests--) {
			String num = ns.nextLine();
			int count = 0;
			int startIndex = 0;
//			This for loops determines what numbers of n digits we are currently adding up
			for (int numDigits = 1; numDigits <= num.length(); numDigits++) {	
//				This for loop sums up the numbers of n digits
				for (startIndex = 0; startIndex+numDigits <= num.length(); startIndex++) {
					int toAdd = Integer.parseInt(num.substring(startIndex, startIndex+numDigits));
//					This conditional determines if we are adding the whole number and finalizes the print statement 
					if (toAdd != 0 && numDigits == num.length()) {
						System.out.print(toAdd + " = ");
						count += toAdd;
					}
//					This conditional adds up the sub-numbers 
					else if (toAdd != 0) {
						System.out.print(toAdd + "+");
						count += toAdd;
					}
				}
			}
			System.out.println(count + "\r\r");
		}
		ns.close();

	}

}
