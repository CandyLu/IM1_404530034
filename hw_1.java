/*
 * [A]100
 * [TA's advise]
 * 1.先向使用者問好這件事情是禮貌的, 非常好!
 * 2.希望上次來問問題的時候有讓你聽懂, 期待接下來的程式會越寫越好.
 * */

package homework_1;

import java.io.IOException;
import java.util.Scanner;

class Rectangle {
	double height, width, X, Y;

	Rectangle() {
		this(0, 0, 0, 0);
	}

	Rectangle(double _height, double _width, double _X, double _Y) {
		this.height = _height;
		this.width = _width;
		this.X = _X;
		this.Y = _Y;
	}

	double getHeight() {
		return this.height;
	}

	double getWidth() {
		return this.width;
	}

	double getX() {
		return this.X;
	}

	double getY() {
		return this.Y;
	}

	//
	public String toString() {
		return "java.Rectangle[x=" + this.X + ",y=" + this.Y + ",width=" + this.width + ",height=" + this.height + "]";
	}
}

public class hw_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("Hello user!");
			// 把不是輸入數字的錯誤找出來
			try {
				Scanner scanner = new Scanner(System.in);
				// 先宣告四個值
				double h, w, x, y;

				// 提供使用者讓他們輸入
				System.out.print("請輸入矩形的 height=");
				h = scanner.nextDouble();
				System.out.print("請輸入矩形的 width=");
				w = scanner.nextDouble();

				System.out.print("請輸入 x=");
				x = scanner.nextDouble();

				System.out.print("請輸入 y=");
				y = scanner.nextDouble();
				// 產生物件(他會去call第10行)

				Rectangle r1 = new Rectangle(h, w, x, y);

				System.out.println(r1);
				System.out.println("Area =" + r1.getHeight() * r1.getWidth());
				System.out.println("Perimeter =" + (r1.getHeight() + r1.getWidth()) * 2);

				// 提供使用者讓他們輸入
				System.out.print("請輸入矩形的 height=");
				h = scanner.nextDouble();
				System.out.print("請輸入矩形的 width=");
				w = scanner.nextDouble();

				System.out.print("請輸入 x=");
				x = scanner.nextDouble();

				System.out.print("請輸入 y=");
				y = scanner.nextDouble();

				Rectangle r2 = new Rectangle(h, w, x, y);
				System.out.println(r2);
				System.out.println("Area =" + r2.getHeight() * r2.getWidth());
				System.out.println("Perimeter =" + (r2.getHeight() + r2.getWidth()) * 2);
			} catch (Exception ex) {
				System.out.println("====請重試一次，只能輸入數字====");
			}
			System.out.print("====End of Output!====");
		}
	}
}
