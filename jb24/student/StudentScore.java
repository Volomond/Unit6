package by.epam.jb24.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentScore {
	
public List<Student> studScoreCre(double subCount) {
	Scanner scan = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();
	double size = subCount;
	for(int i = 0; i < size; i++) {
		System.out.println("Please enter score for " + (i+1) + " subject: ");
		int score = scan.nextInt(); 
		//int score = new Random().nextInt(5);
		list.add(new Student(score));
		
	}System.out.println("Studen's scores: ");
	for(int j=0; j < size; j++ ) {
	System.out.println(list.get(j).getValue());
	}
	return list;
 }	
}
