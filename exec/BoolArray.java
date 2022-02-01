class Smol {

	public boolean[] boolArr;

	public Smol init() {
		boolArr = new boolean[10];

		clearBool();

		return this;
	}

	public void clearBool() {
		int i = 0;
		while(i < 10) {
			boolArr[i] = false;
			i = i + 1;
		}
	}

	public void setBool() {
		int i = 0;
		while(i < 10) {
			boolArr[i] = true;
			i = i + 1;
		}
	}

	public void testBool() {
		int i;
		int offset;
		int step;

		clearBool();

		step = 1;
		while (step < 8) {

			offset = 0;
			while (offset < step) {
		
				/* Set every 4th bool to true */
				i = 0;
				while(i < 10) {
					if (i % step == offset) {
						boolArr[i] = true;
					}
					i = i + 1;
				}

				i = 0;
				while(i < 10) {
					if (boolArr[i]) {
						System.out.write(84);
					} else {
						System.out.write(70);
					}
					System.out.write(10);
					i = i + 1;
				}

				System.out.write(10);

				clearBool();
				offset = offset + 1;
			}

			step = step + 1;
		}
		
		System.out.flush();
	}

	public static void main(String[] args) {
		Smol smol = new Smol().init();

		smol.testBool();
	}
}
