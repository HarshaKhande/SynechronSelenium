
public class FinalKeywordEg {

	// final variable becomes constant and cannot be modified

	int speed = 100;

	public void display() {

		speed = 20;

	}

	public static void main(String[] args) {

		FinalKeywordEg obj = new FinalKeywordEg();

		obj.display();

	}

}
