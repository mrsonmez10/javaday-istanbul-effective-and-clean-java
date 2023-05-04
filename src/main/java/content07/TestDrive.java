package content07;

import java.util.Iterator;
import java.util.List;


public class TestDrive {

	public static void exec(List<String> n, List<Integer> a) {
		Iterator<String> i = n.iterator();
		while (i.hasNext()) {
			System.out.println(" --> " + i.next());
		}

		Iterator<Integer> i2 = a.iterator();
		while (i.hasNext()) {
			System.out.println(" --> " + i2.next());
		}
	}
	// for (Iterator<Suit> i = suits.iterator(); i.hasNext();)

	public static void main(String[] args) {
		List<String> names = List.of("James Hetfield", "Kirk Ham.", "Robert", "Lars", "Cliff");
		List<Integer> ages = List.of(51, 50, 40, 54, 35);
		exec(names, ages);
	}
}