package E2E.Frame.Pages;

public class staticchild extends staticb {

	public staticchild(String Address, String City) {
		super(Address, City);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticchild sc = new staticchild("Ba","Ca");
		staticchild sa = new staticchild("Ba","Ca");
		System.out.println(sc.Address);
		getstaticnname();
		sc.geti();
	}
	
	public void geti() {
		int i=7;
		System.out.println(super.i + "and"+i);
	}

}
