class a {
    public static void main(String[] args) {
        new a().q(6,-7,8,-9,10);
    }
    
    public void q(int a, int b, int c, int d, int e) {
        System.out.println(a+b);
        System.out.println(a+b+c);
        System.out.println(a+b+c+d);
        System.out.println(a+b+c+d+e);
        System.out.println(a+3);
        System.out.println(a+b+5);
        System.out.println(5+(a+c));
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println((a+b)*8);
        System.out.println(5+(b*4+c));
        System.out.println(5+(a+2*c));
        System.out.println(a+(b*2+(c*4+12+d)));
        System.out.println(4*d+2*(a+3+8*(b+c*4)));
        System.out.println(a*4+5);
        System.out.println(a*9+5);
        System.out.println((a+3)+5);
        System.out.println(a*2-5);
        System.out.println(a*2+(-5));
    }
}
