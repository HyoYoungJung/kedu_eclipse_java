package programming;

public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x =" + getX() + ", y = " + getY();
	}
}
