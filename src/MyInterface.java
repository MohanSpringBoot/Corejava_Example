@FunctionalInterface
public interface MyInterface {
	public void getDetails();
	public void getData()
	default void getResult() {
	}

}
