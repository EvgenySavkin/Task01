package by.it.task01.Savkin;

public class Main3 { // перевод байт в мегабайты и килобайты

	public static void main(String[] args) {
		double a = 58995756;
		double b;
		double c;
		b = a / 1024;
		c = b / 1024;
		
System.out.println(a + " байт = " + b + " килобайт");
System.out.println( a + " байт = " + c + " мегабайт");
	}

}
