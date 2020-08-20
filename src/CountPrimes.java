import java.util.Arrays;

public class CountPrimes {
	// Problem Statement : https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/
	public int countPrimes(int n) {
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		if (primes.length > 0)
			primes[0] = false;
		if (primes.length > 1)
			primes[1] = false;
		int x = (int) Math.sqrt(n) + 1;
		for (int i = 2; i < x; i++) {

			if (primes[i])
				for (int j = i * i; j < primes.length; j += i) {
					if (primes[j]) {
						primes[j] = false;
					}
				}
		}
		int count = 0;
		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				count++;
			}
		}
		return count;
	}
}
