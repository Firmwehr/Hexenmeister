class Main {
    public int length;
    public int[] values;

    public Main init() {
        length = 6;
        values = new int[length];
        values[0] = 1;
        values[1] = 2147483647;  /* 2^31-1    = 0111..111 */
        values[2] = 1073741825;  /* 2^30+1    = 0100..001 */
        values[3] = -1;          /*             1111..111 */
        values[4] = -2147483648; /* -2^31     = 1000..000 */
        values[5] = -2147483647; /* -2^31 + 1 = 1000..001 */
        return this;
    }

    public void run() {
        int step = 0;
        while (step < length) {
            int i = values[step];

            System.out.println(i * 0);

            System.out.println(i * 1);          /* 2^0 */
            System.out.println(i * 2);          /* 2^1 */
            System.out.println(i * 4);          /* 2^2 */
            System.out.println(i * 536870912);  /* 2^29 */
            System.out.println(i * 1073741824); /* 2^30 */

            System.out.println(i * -1);          /* -2^0 */
            System.out.println(i * -2);          /* -2^1 */
            System.out.println(i * -4);          /* -2^2 */
            System.out.println(i * -536870912);  /* -2^29 */
            System.out.println(i * -1073741824); /* -2^30 */
            System.out.println(i * -2147483648); /* -2^31 */

            System.out.write(10);

            System.out.println(i / 1);          /* 2^0 */
            System.out.println(i / 2);          /* 2^1 */
            System.out.println(i / 4);          /* 2^2 */
            System.out.println(i / 536870912);  /* 2^29 */
            System.out.println(i / 1073741824); /* 2^30 */

            System.out.println(i / -1);          /* -2^0 */
            System.out.println(i / -2);          /* -2^1 */
            System.out.println(i / -4);          /* -2^2 */
            System.out.println(i / -536870912);  /* -2^29 */
            System.out.println(i / -1073741824); /* -2^30 */
            System.out.println(i / -2147483648); /* -2^31 */

            System.out.write(10);
            System.out.write(10);

            step = step + 1;
        }
    }

    public static void main(String[] args) {
        new Main().init().run();
    }
}
