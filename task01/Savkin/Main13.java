package by.it.task01.Savkin;

import java.util.Scanner;

public class Main13 {      //  ��������� ��� ����� �� 1 �� ���������� ������������� �����

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ������� ����� ");
		int n = sc.nextInt();
		while (a < n) {
			sum = sum + a;
			a++;
		}

	}

}
