package quiz.d_;

import java.util.ArrayList;

public class D01_StudentClass {
	
	static int student = 30;
	static int startStudentNum=300;
	static double max=-999;
	ArrayList<Integer> studentNum = new ArrayList<>();
	ArrayList<Integer> korean = new ArrayList<>();
	ArrayList<Integer> math = new ArrayList<>();
	ArrayList<Integer> english = new ArrayList<>();
	ArrayList<Double> avaScore = new ArrayList<>();
	
	void insertScore() {
		for(int i=0;i<student;i++) {
			studentNum.add(startStudentNum);
			korean.add((int)(Math.random()*101)+0);
			math.add((int)(Math.random()*101)+0);
			english.add((int)(Math.random()*101)+0);
			
			double ava = (korean.get(i)+math.get(i)+english.get(i))/(double)3;
			avaScore.add(ava);
			startStudentNum++;
			if(ava>max) {
				max = ava;
			}
		}
	}
	
	void printAvaScore() {
		for(int i=0;i<studentNum.size();i++) {
			System.out.printf("%d���л��� ��� ����:%.2f\n",studentNum.get(i),avaScore.get(i));
		}
		System.out.println();
	}
	
	void findMaxScoreStudent() {
		int index = avaScore.indexOf(max);
		int maxStudent = studentNum.get(index);
		double maxScore = avaScore.get(index);
		System.out.printf("%d���� ��������� ���� ���� �л��� %d�й� �л��� %.2f���Դϴ�\n",student,maxStudent,maxScore);
		System.out.printf("[����:%d, ����:%d, ����:%d]",korean.get(index),math.get(index),english.get(index));
	}
}









