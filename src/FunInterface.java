
public class FunInterface {

	public static void main(String[] args) {

		MyInterface iface= ()->{
			System.out.println("this is method");
		};
		iface.getResult();
	}

}
