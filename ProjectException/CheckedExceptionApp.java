import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		// Exception 자식인 RuntimeException과 그의 자식 Exception들은 Unchecked Exception으로 예외 처리를 강제하지 않는다. 예외 처리를 하지 않아도 컴파일이 된다.
		// 그 외의 Exception들은 Checked Exception으로 예외 처리를 강제하고, 예외 처리를 하지 않으면 컴파일 조차 되지 않는다.
		try {	// Checked Exception 같은 경우에는 무조건 예외 처리를 해주어야 컴파일이 된다.
			FileWriter f = new FileWriter("data.txt");
			f.write("Hello");
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
