package by.epam.jb24.student;

import java.util.Scanner;

public class inOut {

	public int inRunSub() {
	int count;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter amount of subject ");
	while(!sc.hasNextInt()) {
		sc.next();
		System.out.println("Please enter amount of subject ");
	}
	count = sc.nextInt();
	return count;
	}
	
	public int inRunStud() {
	int count;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter amount of students ");
	while(!sc.hasNextInt()) {
		sc.next();
		System.out.println("Please enter amount of students ");
	}
	count = sc.nextInt();
	return count;
	}
	
	public void outRunGrSum(double res) {
		System.out.println("Average Score of the Students: " + res);
	}
	
	public void outRunStAver(double res) {
		System.out.println("Average Score of the Student: " + res);
	}
	
	public void outRunGrAver(double res) {
		System.out.println("Average Score of the Group: " + res);
	}
	
	public void outRunLoserCount(int res) {
		System.out.println("Loser count: " + res);
	}
	
	public void outRunGoodBoyCount(int res) {
		System.out.println("Good boys count: " + res);
	}

}


