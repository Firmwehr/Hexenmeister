class Test {
	
	public static void main(String[] args) {
		int b = 1;
		int d = 3;
		int e = 4;
		int f = 5;
		
		boolean run = true;

		while (run) {

			d = f;
			b = e;
			f = e;
			

			System.out.println(d);

			run = false;
		}
	}
}
