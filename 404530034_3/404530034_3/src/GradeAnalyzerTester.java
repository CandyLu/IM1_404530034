/*
 * [A]100
 * [TA's Advise]
 * 1. �S����Ӥj�����D, �ܴ�!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double TempScore = 0;
		String TempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "�п�J�ǥͦ��Z:");
			// ���b�G��J��q���j�p�g
			if (TempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(TempInput));
			} catch (Exception e) {
				System.out.println("�L�ļƦr�A�Э��s��J");
			}
		}

		// �ʤ֧P�_�O�_�Ӽ�<2, -2.
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
