import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	/*
	 * Problem Statement: https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
	 */
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (hm.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
