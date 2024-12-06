
public class Encapsulation1Eg {

	private String empname;

	private String idNum;

	private int age;

	public void getage() {

		System.out.println(age);
	}

	public void getidNum() {

		System.out.println(idNum);
	}

	public void getempname() {

		System.out.println(empname);
	}

	public void setage(int a) {

		this.age = a;

	}

	public void setempname(String en) {

		this.empname = en;

	}

	public void setempid(String id) {

		this.idNum = id;

	}

	public static void main(String[] args) { 
		
		Encapsulation1Eg en = new Encapsulation1Eg();

		en.setage(45);
		
		en.setempid("5677");
		
		en.setempname("Peter");
		
		en.getage();
		
		en.getempname();
		
		en.getidNum();

	}

}
