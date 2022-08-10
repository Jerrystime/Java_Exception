import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// try with resource statements
		try (FileWriter f = new FileWriter("data.txt")) {	// try 괄호() 안에 close()가 필요한 클래스를 인스턴스화하는 코드를 넣는다. 그러면 자바는 close()를 자동으로 해준다.
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
