package programming;

public class Ex03 {

	public static void main(String[] args) {
		for (Direction d : Direction.values())
			System.out.print(d + " ");
	}

	enum Direction {
		λ, μ, λ¨, λΆ
	}
}
