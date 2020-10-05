import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class ACPCKickoff2020 {
	static Scanner sc;
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		sc = new Scanner("box.in");
		//sc  = new Scanner(System.in);
		A();
		out.flush();
	}
	public static void A() throws IOException{
		int t =sc.nextInt();
		while(t-->0) {
			long n=sc.nextInt();
			long ans = (n*(n+1))%(1000000007);
			ans*=(n+2);
			ans%=1000000007;
			out.println(ans);
			
		}
	}

	public static void B() throws IOException{
		int t =sc.nextInt();
		while(t-->0) {
		int n =sc.nextInt();
		int m=sc.nextInt();
		out.println(n-m);
	}
	}
	

	
	
	public static void C() throws IOException {
		int t =sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			ArrayList<Integer> a= new ArrayList<Integer>();			
			ArrayList<Integer> sets [] = new  ArrayList[33];

			for(int i=0;i<n;i++) {
				a.add(sc.nextInt());
			}
			ArrayList<Integer> ult =CHelper(a);
			while(ult.size()!=a.size()) {
				a=ult;
				ult=CHelper(a);
			}
			Collections.sort(ult);
			for(int i=0;i<ult.size();i++) {
				if(i==ult.size()-1) {
					out.print(ult.get(i));
				}
				else {
					out.print(ult.get(i)+" ");
				}
			}
			out.println();
		}
	}
	public static ArrayList<Integer> CHelper(ArrayList<Integer> a){
		ArrayList<Integer> ans= new ArrayList<>();
		ArrayList<Integer> sets [] = new  ArrayList[33];
		for (int i = 0; i < a.size(); i++) {
			int count =0;
			for(int j=0;j<32;j++) {
				if((a.get(i)&(1<<j)) == (1<<j)) {	
					count ++;
				}
			}
			if(sets[count]==null) {
				sets[count]= new ArrayList<>();
			}
			sets[count].add(a.get(i));
		
		}
		for(int i=0;i<sets.length;i++) {
			if(sets[i]!=null) {
				int x = sets[i].get(0);
				for(int j=1;j<sets[i].size();j++) {
					x^=sets[i].get(j);
				}
				ans.add(x);
			}
		}
		return ans;
	}

	public static void D() throws IOException{
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int a[]= new int [n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			long count=0;
			int j=1;
			for(int i=n-2;i>=0;i--) {
				count+=(a[i+1]-a[i])*(j++);
			}
			out.println(count);
		}
	}
	public static void J() throws IOException{
		int t=sc.nextInt();
		while(t-->0) {
			int k =sc.nextInt();
			int n=sc.nextInt();
			out.println(k/n+" "+(k%n));
		}
		
	}
	public static void K() throws IOException{
		int t =sc.nextInt();
	all:	while(t-->0) {
			String s =sc.nextLine();
			for(int i=0;i<s.length();i++) {
				if((i<s.length()-1&&s.charAt(i)=='r'&&s.charAt(i+1)=='n')){
					out.println("not sure");
					continue all;
				}
			}
			out.println("sure");
		}
	}

	static class Scanner{
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream system) { br = new BufferedReader(new InputStreamReader(system));}
		public Scanner(String file) throws Exception{br = new BufferedReader(new FileReader (file));}
		public String next() throws IOException{
			while (st==null|| !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException{
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException{
			return br.readLine();
		}
 
	}
}
