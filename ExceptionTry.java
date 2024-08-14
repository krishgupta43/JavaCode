package Examples;

public class ExceptionTry {
	public static void main(String[] args) {

		try {
			int a = 10 / 0;
		}catch (Exception e) {
			System.out.println("cathcing............");
		}catch (ArithmeticException r) {
			System.out.println(r.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} 
		

	}

}
