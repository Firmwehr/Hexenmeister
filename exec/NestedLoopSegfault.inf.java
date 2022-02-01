/* SEGFAULT */
class a {
	public static void main(String[] args) {
		int n = 11;
		int[] perm1 = new int[n];
		int[] count = new int[n];

		{int i=0; while(i<n) { perm1[i] = i; i=i+1; }}
		int r = n;

		boolean b = true;
		while (b) {
			while (r != 1){ count[r-1] = r; r=r-1; }
			boolean brek = false;
			while (!brek) {
				perm1[r] = perm1[0];
			}
		}
	}
}
