package by.it.task01.Savkin;

public class Main7 { // подсчет отрицательных чисел среди данных

	public static void main(String[] args) {
		int a = 10;
		int b = -5;
		int c = -1;
		int z = 0;
		if (a < 0)
			z = z + 1;
		if (b < 0)
			z = z + 1;
		if (c < 0)
			z = z + 1;
		System.out.println("Среди чисел " + a + " " + b + " " + c + " Отрицательных - " + z );

	}

}
