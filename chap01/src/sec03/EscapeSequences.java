package sec03;

public class EscapeSequences {
	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C');
		System.out.println("AB" + '\t' + 'C');
		System.out.println("AB" + '\n' + 'C');
		System.out.println("AB" + '\r' + 'C');

		System.out.println("\"AB" + 'C' + '\"');
		System.out.println("\'AB" + 'C' + '\'');
		System.out.println("\\AB" + 'C' + '\\');
	}

}