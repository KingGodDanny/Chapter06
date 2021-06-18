package echo.ex04;

public class Multithread {

	public static void main(String[] args) {

		// DigitRunableImpl digit = new DigitRunableImpl();
		// 얼래는 밑에 Thread()에 digit를 넣어주지만 아래의 방법으로 생략가능함

		Thread thread = new Thread(new DigitRunableImpl());
		thread.start();

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
