


	public class Excp {
		
		public void arraybound() {
			
			try {
				int a[] = new int[5];
				a[10]=45;
				
			}catch (Exception e) {
	 
				
				System.out.println(e);
				
			}
			}

		public static void main(String[] args) {
			Excp obj =new Excp();
			obj.arraybound();

		}

	}

