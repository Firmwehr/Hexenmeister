/* only with O0 */
class a {
	public static void main(String[] args) {
		int x = 15352;
		int y = 5;
		y = x % (-y);
		y = y/y - x%y;
	}
}
