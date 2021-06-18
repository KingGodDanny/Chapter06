package echo.ex05;

public class UpperImpl implements Runnable {

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
