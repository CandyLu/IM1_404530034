/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大的問題, 很棒!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double TempScore = 0;
		String TempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "請輸入學生成績:");
			// 不在乎輸入的q的大小寫
			if (TempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(TempInput));
			} catch (Exception e) {
				System.out.println("無效數字，請重新輸入");
			}
		}

		// 缺少判斷是否個數<2, -2.
		GA.analyzeGrades();
		// OUPUT
		System.out.println(
				"You entered " + GA.CntUserInput + " valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println();
		System.out.println("The average = " + (int) GA.Avg + " with a standard deviation = " + (int) GA.SD);
		System.out.println();
		System.out.println(GA);
	}
}
