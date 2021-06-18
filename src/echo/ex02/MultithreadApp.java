package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) {

		Thread thread = new DigitThread();
		thread.start(); // .start를 시키면 내부에(이동, 자리세팅) run()을 실행하게되있음.

		// thread.run();했을때랑 비교

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}
