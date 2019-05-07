import java.util.Scanner;

public class LogicTillSixDigit {
	
	public String makeIt5(String x) {
		String s1 = x;
		String s2= s1.trim().substring(1, 6);
		return s2;
	}
  // makeIt5

	public static void main(String[] args) {

		System.out.println("enter no for conversion");
		Scanner sc = new Scanner(System.in);

		//////////////////////////////////////////////////////

		String s1 = sc.nextLine();
		sc.close();
		int len = s1.length();// length of the input number

		//////////////////////////////////////////////////////

		int i = Integer.parseInt(s1);
		System.out.println("entered number  : " + i);
		System.out.print("number in words : ");

		//////////////////////////////////////////////////////

		String oneDigit[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine " };
		String mulOf10[] = { "ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ","ninety " };
		String teens[] = { "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen " };
		String denom[] = { "hundred ", "thousand ", "lakh " };

		//////////////////////////////////////////////////////

		if (len == 0) {
			System.out.println("no input");
		}
		// working till here

		if (len == 1) {
			if (i == 0) {
				System.out.println("zero");
			} else {
				System.out.println(oneDigit[i]);
			}
		}
		// working till here

		if (len == 2) {
			if (i % 10 == 0) {
				System.out.println(mulOf10[i / 10 - 1]);
			}
			if (10 < i && i < 20) {
				System.out.println(teens[i % 10 - 1]);
			}
			if (i % 10 != 0 && i > 20) {
				System.out.println(mulOf10[i / 10 - 1] + " " + oneDigit[i % 10]);
			}
		}
		// working till here

		if (len == 3) {
			System.out.print(oneDigit[i / 100] + denom[0]);
			if (i % 100 < 10) {
				System.out.print(oneDigit[i % 100]);
			} else if (i % 100 % 10 == 0) {
				System.out.print(mulOf10[i % 100 / 10 - 1]);
			} else if (i % 100 < 20) {
				System.out.print(teens[i % 100 % 10 - 1]);
			} else if (i % 100 > 20) {
				System.out.print(mulOf10[i % 100 / 10 - 1] + oneDigit[i % 100 % 10]);
			}
		}
		// working till here

		if (len == 4) {
			System.out.print(oneDigit[i / 1000] + denom[1]);
			if (i % 1000 / 100 > 0) {
				System.out.print(oneDigit[i / 1000] + denom[0]);
			}
			if (i % 1000 % 100 < 10) {
				System.out.print(oneDigit[i % 1000 % 100]);
			} else if (i % 1000 % 100 % 10 == 0) {
				System.out.print(mulOf10[i % 1000 % 100 / 10 - 1]);
			} else if (i % 1000 % 100 < 20) {
				System.out.print(teens[i % 1000 % 100 % 10 - 1]);
			} else if (i % 1000 % 100 > 20) {
				System.out.print(mulOf10[i % 1000 % 100 / 10 - 1] + oneDigit[i % 1000 % 100 % 10]);
			}
		}
		// working till here

		if (len == 5 ) {
			if (i % 10000 == 0) {
				System.out.print(mulOf10[i / 10000 - 1] + denom[1]);
			} else {
				if (i % 10000 / 1000 < 10 && i < 20000) {
					System.out.print(teens[i % 10000 / 1000 - 1] + denom[1]);
				}
				if (i % 10000 / 1000 < 10 && i > 20000) {
					System.out.print(mulOf10[i / 10000 - 1] + oneDigit[i % 10000 / 1000] + denom[1]);
				}
			}
			if (i % 10000 % 1000 / 100 < 10 && i % 10000 % 1000 / 100 != 0) {
				System.out.print(oneDigit[i % 10000 % 1000 / 100] + denom[0]);
			}
			if (i % 10000 % 1000 % 100 < 10) {
				System.out.print(oneDigit[i % 10000 % 1000 % 100]);
			} else if (i % 10000 % 1000 % 100 % 10 == 0) {
				System.out.print(mulOf10[i % 10000 % 1000 % 100 / 10 - 1]);
			} else if (i % 10000 % 1000 % 100 < 20) {
				System.out.print(teens[i % 10000 % 1000 % 100 % 10 - 1]);
			} else if (i % 10000 % 1000 % 100 > 20) {
				System.out.print(mulOf10[i % 10000 % 1000 % 100 / 10 - 1] + oneDigit[i % 10000 % 1000 % 100 % 10]);
			}

		}
		// working till here
		if (len==6) {
			System.out.print(oneDigit[i / 100000] + denom[2]);

			String stuff = new Logic1().makeIt5(s1);
			int ituff = Integer.parseInt(stuff);
			
			if (ituff % 10000 == 0) {
				System.out.print(mulOf10[ituff / 10000 - 1] + denom[1]);
			} else {
				if (ituff % 10000 / 1000 < 10 && ituff < 20000) {
					System.out.print(teens[ituff % 10000 / 1000 - 1] + denom[1]);
				}
				if (ituff % 10000 / 1000 < 10 && ituff > 20000) {
					System.out.print(mulOf10[ituff / 10000 - 1] + oneDigit[ituff % 10000 / 1000] + denom[1]);
				}
			}
			if (ituff % 10000 % 1000 / 100 < 10 && ituff % 10000 % 1000 / 100 != 0) {
				System.out.print(oneDigit[ituff % 10000 % 1000 / 100] + denom[0]);
			}
			if (ituff % 10000 % 1000 % 100 < 10) {
				System.out.print(oneDigit[ituff % 10000 % 1000 % 100]);
			} else if (ituff % 10000 % 1000 % 100 % 10 == 0) {
				System.out.print(mulOf10[ituff % 10000 % 1000 % 100 / 10 - 1]);
			} else if (ituff % 10000 % 1000 % 100 < 20) {
				System.out.print(teens[ituff % 10000 % 1000 % 100 % 10 - 1]);
			} else if (ituff % 10000 % 1000 % 100 > 20) {
				System.out.print(mulOf10[ituff % 10000 % 1000 % 100 / 10 - 1] + oneDigit[ituff % 10000 % 1000 % 100 % 10]);
			}
		}
		// working till here
		
		
	}

}
