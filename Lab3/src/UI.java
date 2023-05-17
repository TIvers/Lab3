

public class UI {

	public static void main(String[] args) {
		IOperation[] operations = {
			new Addition(), new Subtraction(), 
			new Multiplication(), new Maximum(), new Div(),new Minimum(),new Divison()		
		};
		
		int a = 130, b = 15;
		for (IOperation op : operations) {
			System.out.println(op.getName());
			System.out.printf("%d %s %d = %d\n", 
					a, op.getSign(), b, op.estimate(a,  b));
		}
	}

}
