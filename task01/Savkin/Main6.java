package by.it.task01.Savkin;

public class Main6 {  //определение треугольника по углам

	public static void main(String[] args) {
		int a = 89;
		int b = 90;
		if ((a + b) < 180) {
			System.out.print(" Треугольник с углами " + a + " " + b + " существует");
			if ((a == 90) || (b == 90))
				System.out.println(", он прямоугольный");
		}
		else
			System.out.println(" Треугольника с углами " + a + " " + b + " не существует");
             

	}
}
