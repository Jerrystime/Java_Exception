
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2 / 0);	// Java는 0으로 나누는 것을 못하게 되어있는데 0으로 나누려고 하기 때문에 ArithmeticException이 뜨게 된다.
		System.out.println(3);
	}

}
