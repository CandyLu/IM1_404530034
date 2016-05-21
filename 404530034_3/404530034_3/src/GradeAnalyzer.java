import java.util.ArrayList;

class MyCount {
	String name;
	int mcnt;

	MyCount() {
	}

	MyCount(String _name, int _mcnt) {
		this.name = _name;
		this.mcnt = _mcnt;
	}

	// override
	public String toString() {
		return this.name + "=" + this.mcnt;
	}
}

public class GradeAnalyzer {
	int CntUserInput = 0;
	double TotalNumb = 0, SD = 0, Avg = 0, GetNumb = 0, SDtemp = 0;
	ArrayList<Double> NumbScore = new ArrayList<Double>();
	MyCount[] GradeDis = new MyCount[11];
	boolean First = true;

	static boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		return false;
	}

	public void addGrade(double aGrade) {
		// Good, +2.
		if (First) {
			GradeDis[0] = new MyCount("A+", 0);
			GradeDis[1] = new MyCount("A", 0);
			GradeDis[2] = new MyCount("A-", 0);
			GradeDis[3] = new MyCount("B+", 0);
			GradeDis[4] = new MyCount("B", 0);
			GradeDis[5] = new MyCount("B-", 0);
			GradeDis[6] = new MyCount("C+", 0);
			GradeDis[7] = new MyCount("C", 0);
			GradeDis[8] = new MyCount("C-", 0);
			GradeDis[9] = new MyCount("D", 0);
			GradeDis[10] = new MyCount("F", 0);
			First = false;
		}
		if (!isValidGrade(aGrade)) {
			return;
		}
		// 分數的評斷標準和次數
		NumbScore.add(aGrade);
		TotalNumb += aGrade;
		CntUserInput++;
		if (aGrade >= 90) {
			if (aGrade >= 98)
				GradeDis[0].mcnt++;
			else if (aGrade >= 92 && aGrade < 98)
				GradeDis[1].mcnt++;
			else
				GradeDis[2].mcnt++;
		} else if (aGrade >= 80) {
			if (aGrade >= 88)
				GradeDis[3].mcnt++;
			else if (aGrade >= 82 && aGrade < 88)
				GradeDis[4].mcnt++;
			else
				GradeDis[5].mcnt++;
		} else if (aGrade >= 70) {
			if (aGrade >= 78)
				GradeDis[6].mcnt++;
			else if (aGrade >= 72 && aGrade < 78)
				GradeDis[7].mcnt++;
			else
				GradeDis[8].mcnt++;
		} else {
			if (aGrade >= 60)
				GradeDis[9].mcnt++;
			else if (aGrade < 60)
				GradeDis[10].mcnt++;
		}
	}

	// 算平均跟標準差
	public void analyzeGrades() {
		Avg = TotalNumb / CntUserInput;
		for (int i = 0; i < NumbScore.size(); i++) {
			SDtemp += (NumbScore.get(i) - Avg) * (NumbScore.get(i) - Avg);
		}
		SD = Math.round((Math.sqrt(SDtemp / CntUserInput)));
	}

	public String toString() {
		String grade = "";
		for (int i = 0; i < GradeDis.length; i++) {
			grade += GradeDis[i] + "\n";
		}
		return "The grade distribution is : \n\n" + grade;

	}
}
