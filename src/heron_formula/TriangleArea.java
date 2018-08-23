package heron_formula;

import exception.TriangleFailureExeption;
import exception.ZeroNumberException;

public class TriangleArea {

	public double heron(double a, double b, double c) {
		double s = (a + b + c) / 2;
		double S = (double)Math.sqrt(s * (s - a) * (s - b) * (s - c));
		S = (int)(S * 1000) / 1000d;
		return S;
	}

	public void printTri(double a, double b, double c) {
		double s = heron(a, b, c);
		System.out.println(s);
	}

	public static void main(String args[]) throws Exception {
		double a = 0, b = 0, c = 0;
		try {
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);

			if(args.length < 3 || args.length > 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else if (a <= 0 || b <= 0 || c <= 0) {
				throw new ZeroNumberException();
			} else if(a + b < c || b + c < a || a + c < b) {
				throw new TriangleFailureExeption();
			} else if (Math.abs(a - b) > c || Math.abs(b - c) > a || Math.abs(a - c) > a) {
				throw new TriangleFailureExeption();
			}
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数字を3つ入力してください");
			return;
		} catch (ZeroNumberException e) {
			System.out.println("0以上の数字を入力してください");
			return;
		} catch (TriangleFailureExeption e) {
			System.out.println("三角形の成立条件を満たしていません");
			return;
		}
		TriangleArea tri = new TriangleArea();

		tri.printTri(a, b, c);
	}
}
