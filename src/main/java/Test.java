/**
 * Description:
 * Date: 2019年07月26日 0:48
 * Author: cg
 * Version: 1.0
 */
public class Test {

	public static void main(String[] args) {
		int a = getInt();
		System.out.println(a);
	}

	private static int getInt() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
