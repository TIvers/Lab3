

public class Divison implements IOperation {

	@Override
	public String getSign() {
		return "mod";
	}

	@Override
	public String getName() {
		return "Частное";
	}

	@Override
	public int estimate(int a, int b) {
		return a / b;
	}

}
