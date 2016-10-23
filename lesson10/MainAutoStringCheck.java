package Base25.week5.lesson10;

import java.util.Scanner;

public class MainAutoStringCheck {
	public static void main(String[] args) {
		AutoStringCheck auto = new AutoStringCheck();

		Scanner scan = new Scanner(System.in);

		System.out.println("������� ����� <-1 -�����>:");
		String s1 = scan.next();
		while (!s1.equals("-1")) {
			auto.checkAlias(s1);
			auto.printAllAliases();
			System.out.println("\n������� ����� <-1 -�����>:");
			s1 = scan.next();
		}
	}
}
