import java.util.*;
// An exploration of basic input and output.
class BasicIO {
// Reads and processes string input.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		System.out.print("Enter your heigh: ");
		int height = stdin.nextInt();
// display output on console
		System.out.println("your name is " + name);
		System.out.println("your name is " + years);
		System.out.println("day =" + 365*years);
		System.out.printf(365*years + "일" + name + '(' + years + ')' + "의 키는 " + height + "cm" + "입니다.");
	} // method main
} // class BASIC_IO
