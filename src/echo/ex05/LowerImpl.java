package echo.ex05;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		
		for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
			System.out.println(ch2);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		
	}

	
	
	
}
