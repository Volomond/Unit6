package by.epam.jb24.student;

import java.util.ArrayList;
import java.util.List;

public class Run {
	static double colStud;
	static double colSub;
	static double resultSumScore;
	static double resultSumScoreGr;
	static double resultAverScore;
	static double resultAverScoreGr;
	static int loserLevel=0;
	static int loserCount=0;
	static int goodBoyLevel=0;
	static int goodBoysCount=0;

	public static void main(String[] args) {
		//StudAverage(); 
		//StudGroupAver();
		//SearchingLosers();
		SearchingGoodBoys();
	}
		public static void StudAverage() {
			List<Student> listStud = new ArrayList<Student>();
			colSub = new inOut().inRunSub();
			listStud = new StudentScore().studScoreCre(colSub);
			resultSumScore = new CommonCalc().CalcSudScore(listStud);
			resultAverScore = new CommonCalc().CalcAverScore(listStud,resultSumScore);
			new inOut().outRunStAver(resultAverScore);
		

		}
		
		public static void StudGroupAver() {
			List<Student> listSt = new ArrayList<Student>();
			colSub = new inOut().inRunSub();
			colStud = new inOut().inRunStud();
			for(int i =0; i < colStud; i++) {
			listSt = new StudentScore().studScoreCre(colSub);
			resultSumScoreGr += new CommonCalc().CalcSudScore(listSt);
			}
			new inOut().outRunGrSum(resultSumScoreGr);
			resultAverScoreGr = new CommonCalc().CalcAverScoreGR(resultSumScoreGr,colStud,colSub);
			new inOut().outRunGrAver(resultAverScoreGr);
		}
		
		public static void SearchingLosers() {
			List<Student> listSt = new ArrayList<Student>();
			colSub = new inOut().inRunSub();
			colStud = new inOut().inRunStud();
			for(int i =0; i < colStud; i++) {
			listSt = new StudentScore().studScoreCre(colSub);
			loserLevel = new Searcher().LoserSerch(listSt);
			if (loserLevel!=0) {
				loserCount++;
				}
			}
			new inOut().outRunLoserCount(loserCount);
		}
		
		public static void SearchingGoodBoys() {
			List<Student> listSt = new ArrayList<Student>();
			colSub = new inOut().inRunSub();
			colStud = new inOut().inRunStud();
			for(int i =0; i < colStud; i++) {
			listSt = new StudentScore().studScoreCre(colSub);
			goodBoyLevel = new Searcher().GoodBoySerch(listSt);
			if (goodBoyLevel==0) {
				goodBoysCount++;
				}
			}
			new inOut().outRunGoodBoyCount(goodBoysCount);
		}
}
