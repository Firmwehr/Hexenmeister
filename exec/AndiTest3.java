class a {
    public int ignored;
    public static void main(String[] args) {
        new a().q();
        if (new a().c_false()) {
            int[] c_null = new int[-1];
            a o_null = null;
            System.out.println(c_null[0]);
            o_null.ignored = o_null.ignored();
        }
        return;
    }
    
    public boolean c_false() {
        int i = 7;
        int w = 9;
        while (w < 200) {
            i = i * i;
            w = w * 2;
        }
        return i % 5 == 1;
    }
    
    public int q() {
        int[] c_null = new int[0];
        a o_null = null;
        if (c_false()) {
            int[] c_neg = new int[-32];
            int y = c_null[0];
            c_neg[0] = c_null[0] + o_null.ignored + o_null.ignored();
            return c_null[0];
        }
        if (!c_false()) {
            return 2;
        }
        int w = c_null[2];
        w = w + c_null[-1];
        w = w + c_null[0];
        c_null = new int[2 / 0];
        return w;
    }
    
    public int ignored() {
        return 43 % 0;
    }
}
