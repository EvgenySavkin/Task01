package by.it.task01.Savkin;

public class Main11 { // решение уравнения

	public static void main(String[] args) {
		int a = -10;
		int b = 10;
		int h = 1;
		int x = 0;
		int y = 0;
		x = a;
		while (x < b) {
			if (x <=2) {
				y = x;
				System.out.println("x = " + x + " y = " + y);
				x = x + h;
			}
			if (x > 2) {
				y =  - x;
				System.out.println("x = " + x + " y = " + y);
				x = x + h;
			}
		}

	}

}
