package by.it.task01.Savkin;

public class Main2 { // ���������� �������� ���������

	public static void main(String[] args) {
	double a = 5;
	double b = 5;
	double c = 7;
	double d = 16;
	double rez1;
	if (a == 0 || d == 0)
		System.out.println(" �� ���� �� �����");
	else {
		 rez1 = ((a * c) / (b * d)) - (((a * b) - c) / (c * d));
		System.out.println(" " + rez1);
	}
	}
}
