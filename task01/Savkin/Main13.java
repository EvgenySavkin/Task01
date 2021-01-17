package by.it.task01.Savkin;

import java.util.Scanner;

public class Main13 {      //  суммирует все числа от 1 до введенного пользователем числа

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" ¬ведите число ");
		int n = sc.nextInt();
		while (a < n) {
			sum = sum + a;
			a++;
		}

	}

}
