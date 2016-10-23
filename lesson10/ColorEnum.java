package Base25.week5.lesson10;

import java.util.Scanner;

public enum ColorEnum {
	brown, green, white, black;

	boolean isExist(String s) {
		ColorEnum[] color = ColorEnum.values();
		for (ColorEnum colorEnum : color) {
			if (s.equalsIgnoreCase(colorEnum.toString())) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����");
		String s = scan.next();
		if (ColorEnum.black.isExist(s)) System.out.println("����");
		else System.out.println("���");

	}
}
