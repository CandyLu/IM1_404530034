/*
 * [A]100
 * [TA's advise]
 * 1.���V�ϥΪ̰ݦn�o��Ʊ��O§����, �D�`�n!
 * 2.�Ʊ�W���Ӱݰ��D���ɭԦ����Ať��, ���ݱ��U�Ӫ��{���|�V�g�V�n.
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
			// �⤣�O��J�Ʀr�����~��X��
			try {
				Scanner scanner = new Scanner(System.in);
				// ���ŧi�|�ӭ�
				double h, w, x, y;

				// ���ѨϥΪ����L�̿�J
				System.out.print("�п�J�x�Ϊ� height=");
				h = scanner.nextDouble();
				System.out.print("�п�J�x�Ϊ� width=");
				w = scanner.nextDouble();

				System.out.print("�п�J x=");
				x = scanner.nextDouble();

				System.out.print("�п�J y=");
				y = scanner.nextDouble();
				// ���ͪ���(�L�|�hcall��10��)

				Rectangle r1 = new Rectangle(h, w, x, y);

				System.out.println(r1);
				System.out.println("Area =" + r1.getHeight() * r1.getWidth());
				System.out.println("Perimeter =" + (r1.getHeight() + r1.getWidth()) * 2);

				// ���ѨϥΪ����L�̿�J
				System.out.print("�п�J�x�Ϊ� height=");
				h = scanner.nextDouble();
				System.out.print("�п�J�x�Ϊ� width=");
				w = scanner.nextDouble();

				System.out.print("�п�J x=");
				x = scanner.nextDouble();

				System.out.print("�п�J y=");
				y = scanner.nextDouble();

				Rectangle r2 = new Rectangle(h, w, x, y);
				System.out.println(r2);
				System.out.println("Area =" + r2.getHeight() * r2.getWidth());
				System.out.println("Perimeter =" + (r2.getHeight() + r2.getWidth()) * 2);
			} catch (Exception ex) {
				System.out.println("====�Э��դ@���A�u���J�Ʀr====");
			}
			System.out.print("====End of Output!====");
		}
	}
}
