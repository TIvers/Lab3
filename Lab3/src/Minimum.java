

public class Minimum implements IOperation {

	@Override
	public String getSign() {
		return "MIX";
	}

	@Override
	public String getName() {
		return "Малое число";
	}

	@Override
	public int estimate(int a, int b) {
		return a<b ? a : b;
	}

}
