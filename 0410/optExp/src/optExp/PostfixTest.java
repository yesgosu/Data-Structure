package optExp;

public class PostfixTest {

	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n����ǥ��� : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n������ = %d\n", result);
	}
}