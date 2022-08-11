import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) throws IOException {	// Exception을 위임
		FileWriter f = new FileWriter("./data.txt");
	}

}
