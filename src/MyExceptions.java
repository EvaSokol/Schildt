
public class MyExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("3 / 0");
			System.out.println(3 / 0);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Devision by zero");
		}
	}

}
