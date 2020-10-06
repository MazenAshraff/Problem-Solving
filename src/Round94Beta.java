import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Round94Beta {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	// Contest Link : https://codeforces.com/contest/129
	public static void main(String[] args) throws IOException {
	// 	A();
	//  B();	
		out.flush();
	}
	public static void A() throws IOException{
		int n =sc.nextInt();
		int [] a = new int [n];
		int counteven = 0;
		int countodd=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) {
				counteven++;
			}
			else {
				countodd++;
			}
		}
		if(countodd%2!=0) {
			out.println(countodd);
		}
		else {
			out.println(counteven);
		}
	}

	public static void B() throws IOException {
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			adj.get(x).add(y);
			adj.get(y).add(x);
		}
		int count = 0;
		while (true) {
			boolean used = false;
			for (int i = 0; i < n; i++) {
				if (adj.get(i).size() == 1) {
					if(!used) {
						count++;
						used= true;
					}
				}
			}
			HashSet<Integer> hs = new HashSet<>();
			for (int i = 0; i < n; i++) {
				if (adj.get(i).size() == 1&&!hs.contains(i)) {
					hs.add(adj.get(i).get(0));
					adj.get(adj.get(i).get(0)).remove((Integer) i);
					adj.get(i).remove(0);
				}
			}
			if(!used) break;
		}
		out.println(count);
	}

	public static int getOne(HashSet<Integer> hs) {
		for (int x : hs) {
			return x;
		}
		return -1;
	}

	static class Pair implements Comparable<Pair> {
		int pos;
		int deg;

		public Pair(int pos, int deg) {
			this.pos = pos;
			this.deg = deg;
		}

		@Override
		public int compareTo(Pair o) {
			return deg - o.deg;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}
