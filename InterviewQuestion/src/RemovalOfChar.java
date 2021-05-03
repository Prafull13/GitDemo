import java.util.LinkedHashSet;

public class RemovalOfChar {

	void removalchar(String str) {
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		for (Character ch : lhs) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {

		String s = "geekofgeeks";
		RemovalOfChar r = new RemovalOfChar();
		r.removalchar(s);
	}

}
