package by.it.task01.Savkin;

import java.util.Scanner;

public class Main14 {   //  ��������� �����, ������� ���� ������������

	public static void main(String[] args) {
		int a = 0;
		int f = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ������� ����� ");
		int n = sc.nextInt();
		while (a < n) {
			f = f * a;
			a++;

		}

	}
}