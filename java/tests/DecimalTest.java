import java.text.DecimalFormat;

class DecimalTest {

	public static void main(String[] args) {
		// DecimalFormat df = new DecimalFormat("#.####");
		// Double number = 100.12349;

		// System.out.println(df.format(number));
	}
}

class FormatGenerator {

	private DecimalFormat df;

	public FormatGenerator() {
		df = new DecimalFormat("#.###");
	}

	public void generate(Double data) {
		System.out.println("u entered " + data);
		System.out.print("and u get " + df.format(data));
	}
}