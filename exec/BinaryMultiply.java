class a {
	public static void main(String[] args) {
		new a().mult(7,7);
	}

	public int mult(int n, int m) {
		int result = 0;
		while (n > 0) {

			if (n % 2 != 0) {
				result = result + m;
			}

			System.out.println(m);

			m = m * 2;
			n=n/2;
		}
		return result;
	}
}
