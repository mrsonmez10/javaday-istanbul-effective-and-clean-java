package content01;

public class TestDrive {

	// Can you see any anomaly here?
	private static long topla() {
		Long sum = 0L;
		for (long i = 0; i < 10000; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		topla(); 
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}

