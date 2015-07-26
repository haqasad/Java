import java.util.Scanner;


public class Hello {

	/**
	 * @param args
	 */
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("May I know your name please?");
		String name = scanner.nextLine();
		
		System.out.println("Hello! " + name);
	}

}
