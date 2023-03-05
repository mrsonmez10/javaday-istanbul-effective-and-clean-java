package content05;

import java.util.*;

public class Bigram {

	private final char first;

	public Bigram(char first) {
		this.first = first;
	}

	public boolean equals(Bigram o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Bigram bigram = (Bigram) o;
		return first == bigram.first;
	}

	@Override
	public int hashCode() {
		return 31 * first;
	}

	public static void main(String[] args) {
		Set<Bigram> s = new HashSet<>();
		// key setin 2 tane aynı şeyi içeremez

		s.add(new Bigram('a'));
		s.add(new Bigram('a'));
		s.add(new Bigram('c'));

		System.out.println(s.size());
	}
}