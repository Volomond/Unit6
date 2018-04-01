package by.epam.jb24.student;

import java.util.List;

public class CommonCalc {
	double averageScore;
	int scoreSum = 0;

	
	public int CalcSudScore(List<Student> listStud) {
		for(int i = 0; i < listStud.size(); i++) {
			scoreSum += listStud.get(i).getValue();
		}
		return scoreSum;		
	}
	
	public double CalcAverScore(List<Student> listStud,double sum) {
		return averageScore = sum / listStud.size();		
	}
	
	public double CalcAverScoreGR(double sum, double studCol, double colSub) {
		double den = studCol*colSub;
		System.out.println("Denomenator: " + den);
		averageScore = sum / den;
		return averageScore;
	}
}


