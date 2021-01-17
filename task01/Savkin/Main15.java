package by.it.task01.Savkin;

public class Main15 { // нахождение НОД двух чисел

	public static void main(String[] args) {
		int a = 25;
		int b = 25;
		int temp = 0;
		int i = 1;
		int nod = 0;
		if (a < b) {
			temp = a;
		} else {
			temp = b;
		}
		while (i <= temp) {
			if ((a % i == 0) && (b % i == 0)) {
				nod = i;
			}
			i++;

		}
		System.out.println(nod);
	}

}
