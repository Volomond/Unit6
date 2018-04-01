package by.epam.jb24.student;

import java.util.List;

public class Searcher {
	int levelScore =0;
	
	
	public int LoserSerch(List<Student> listStud) {
		for(int i = 0; i < listStud.size(); i++) {
			if (listStud.get(i).getValue() <= 2) {
				levelScore++;
			}
		}
		return levelScore;	
	}
	
	public int GoodBoySerch(List<Student> listStud) {
		for(int i = 0; i < listStud.size(); i++) {
			if (listStud.get(i).getValue() <= 4) {
				levelScore++;
			}
		}
		return levelScore;	
	}

}
