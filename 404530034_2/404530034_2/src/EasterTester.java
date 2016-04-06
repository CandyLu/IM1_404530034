/*
 * [A]93
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.之後可以嘗試在javadoc中寫一些註解.
 * 4.實作演算法要確判斷下的夠完全喔.
 * */

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello,users!");
		Easter easter = new Easter();

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入年份");
		int aYear1 = scan.nextInt();
		System.out.println(easter.calculateEaster(aYear1));

		System.out.println("請輸入年份");
		int aYear2 = scan.nextInt();
		System.out.println(easter.calculateEaster(aYear2));
	}

}
