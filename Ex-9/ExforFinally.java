//Write a JAVA program for creation of Illustratingfinally
public class ExforFinally {
	public static void main(String arg[]) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;

			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("This is inside finally block");
		}
	}
}