
public class CaseSwitchEg {

	public static void main(String[] args) {

		int number = 80;

		// switch expression

		switch (number) {

		// case statements

		case 10:
			System.out.println("The no is 10");

			// it will terminate the execution of the program and do not go to next line if
			// the condition is true

			break;

		case 20:
			System.out.println("The no is 20");

			break;

		case 30:
			System.out.println("The no is 30");

			break;

		// default statement

		default:
			System.out.println("The no is not 10, 20 nor 30");

		}

	}

}
