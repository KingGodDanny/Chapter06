package echo.ex03;

public class UpperThread extends Thread {

	// 도장만 준비한상태의 클래스를 이해해야함!

	// 필드

	// 생성자

	// 메소드(게터세터)

	// 메소드(일반)

	@Override
	public void run() {

		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			System.out.println(ch1);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}
