/* Infinite loop, leads to OOM */
class a {
	public static void main(String[] args) {
		int n = 0;
		int k = 0;
		int[][] table = new int[n+1][];
		int i=0;
		while (i<=n) {
			table[i] = new int[i+1];
			int j=0;
			while ((j<=i) && (j <= k)) {
				j=j+1;
			}
			i=i+1;
	    }
	}
}
