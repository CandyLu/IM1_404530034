/*
 * [A]93
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.����i�H���զbjavadoc���g�@�ǵ���.
 * 4.��@�t��k�n�T�P�_�U����������.
 * */

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello,users!");
		Easter easter = new Easter();

		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�~��");
		int aYear1 = scan.nextInt();
		System.out.println(easter.calculateEaster(aYear1));

		System.out.println("�п�J�~��");
		int aYear2 = scan.nextInt();
		System.out.println(easter.calculateEaster(aYear2));
	}

}
