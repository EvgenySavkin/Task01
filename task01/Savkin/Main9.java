package by.it.task01.Savkin;

public class Main9 { // решение уравнения

	public static double main(String[] args) {
		int x = 6;
		double y = 0;
		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		}
		if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		
		return y;
	}

}
