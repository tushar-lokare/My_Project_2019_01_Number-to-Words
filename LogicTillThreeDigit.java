import java.util.Scanner;

public class LogicTillThreeDigit {

	public static void main(String[] args) {

		System.out.println("enter no for conversion");
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		int len = s1.length();// length of the input number

		int i = Integer.parseInt(s1);
		System.out.println("you entered: " + i);

		String oneDigit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String mulOf10[] = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String teens[] = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };

		if (len == 0) {
			System.out.println("no input");
		}
		if (len == 1) {
			System.out.println("you entered: " + oneDigit[i]);
		}

		if (len == 2 && i % 10 == 0) {
			System.out.println("you entered: " + mulOf10[i / 10 - 1]);
		}

		if (len == 2 && 10 < i && i < 20) {
			System.out.println("you entered: " + teens[i % 10 - 1]);

		}

		if (len == 2 && i % 10 != 0 && i > 20) {
			System.out.println(mulOf10[i / 10 - 1] + " " + oneDigit[i % 10]);
		}

		if (len == 3) {

			System.out.print(oneDigit[i / 100] + " hundred");
			if (i % 100 < 10) {
				System.out.print(" " + oneDigit[i % 100]);
			} else if (i % 100 % 10 == 0) {
				System.out.print(" " + mulOf10[i % 100 / 10 - 1]);
			} else if (i % 100 < 20) {
				System.out.print(" " + teens[i % 100 % 10 - 1]);
			} else if (i % 100 > 20) {
				System.out.print(" " + mulOf10[i % 100 / 10 - 1] + " " + oneDigit[i % 100 % 10]);
			}
		}

	}

}
