

public class Div implements IOperation {

	@Override
	public String getSign() {
		return "Div";
	}

	@Override
	public String getName() {
		return "Остаток";
	}

	@Override
	public int estimate(int a, int b) {
		return a % b;
	}

}
