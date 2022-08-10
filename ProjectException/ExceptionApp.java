
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10, 20, 30};	// 정수형 데이터 타입을 갖는 scores라는 배열을 만들고, 10, 20, 30 값을 넣어준다.
		try {	// 에외가 발생하는 코드를 try문 안에 넣는다.
			System.out.println(2);
			System.out.println(scores[3]);	// 배열에 없는 4번째 값을 불러오려고 하니 ArrayIndexOutOfBoundsException 예외가 발생한다.
			System.out.println(3);	// try문에서 코드를 하나씩 실행하다가 예외가 발생하게 되면 바로 그 예외의 대한 처리로 넘어가기 때문에 그 밑에 try문 코드는 실행되지 않는다.
			System.out.println(2 / 0);	// Java는 0으로 나누는 것을 못하게 되어있는데 0으로 나누려고 하기 때문에 ArithmeticException이 뜨게 된다.
			System.out.println(4);
		} catch (ArithmeticException e) {	// 예외 처리할 코드를 catch문 안에 넣어주고, 어떤 예외가 발생할 때 catch문을 실행시킬 지 괄호 안에 넣어준다.
			System.out.println("계산이 잘못되었습니다.");	// ArithmeticException이 발생할 경우, 실행할 코드
		} catch (Exception e) {	// 예외 처리할 코드를 catch문 안에 넣어주고, 어떤 예외가 발생할 때 catch문을 실행시킬 지 괄호 안에 넣어준다.
			System.out.println("먼가 이상합니다. 오류가 발생했습니다.");	// 위 예외 외의 모든 Exception이 발생할 경우, 실행할 코드
		}	// 예외가 발생하더라도 어플리케이션이 종료되지 않고, 다음 구문을 실행하게 된다.
		System.out.println(3);
	}

}
