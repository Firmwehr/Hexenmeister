class ModuloTest {
     public static void main(String[] args) {
             new ModuloTest().q(61,-71,81,-91);
     }

     public void q(int a, int b, int c, int d) {
             System.out.println(a%1);
             System.out.println(b%2);
             System.out.println(c%4);
             System.out.println(d%8);
             System.out.println(a%(-1));
             System.out.println(b%(-2));
             System.out.println(c%(-4));
             System.out.println(d%(-8));
             System.out.println(c%(-32));
             System.out.println(a%2+c%(-4)%2+d%2);
             System.out.println(d%53%32%8);
     }
}
