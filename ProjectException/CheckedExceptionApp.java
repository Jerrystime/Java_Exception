import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		// Exception 자식인 RuntimeException과 그의 자식 Exception들은 Unchecked Exception으로 예외 처리를 강제하지 않는다. 예외 처리를 하지 않아도 컴파일이 된다.
		// 그 외의 Exception들은 Checked Exception으로 예외 처리를 강제하고, 예외 처리를 하지 않으면 컴파일 조차 되지 않는다.
		FileWriter f = null;	// f를 main() 메소드 내 전역변수로 선언 및 null 할당
		try {	// Checked Exception 같은 경우에는 무조건 예외 처리를 해주어야 컴파일이 된다.
			f = new FileWriter("data.txt");	// f에 FileWriter 인스턴스 담음
			f.write("Hello");	// f에 "Hello" 문구 쓰기
		} catch (IOException e) {
			e.printStackTrace();	// 예외 발생 시, 예외 발생 정보 출력
		} finally {	// 예외가 발생하더라도 무조건 실행해야 할 코드를 finally문 안에 넣어줘야 한다.
			if (f != null) {	// f가 null 아니라면 if문 실행
				try {	// FileWriter는 Checked Exception이 발생하기 때문에 예외 처리
					f.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
