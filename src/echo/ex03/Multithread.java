package echo.ex03;

public class Multithread {

	public static void main(String[] args) {

		Thread thread1 = new DigitThread();
		Thread thread2 = new UpperThread();
		Thread thread3 = new LowerThread();

		thread1.start();   //run메소드로 실행시키면 thread기능을 쓰지못함!
		thread2.start();
		thread3.start();

	}

}
