package by.it.task01.Savkin;

public class Main1 {        // вычисление значени€ выражени€

	public static void main(String[] args) {
		int a = 1;          
		int b = 1;
		int c = 1;
		double rez;
		if (a == 0) {
			System.out.println(" Ќа ноль не делим ");
		} else {
			rez = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println(" " + rez);
		}
	}
}
