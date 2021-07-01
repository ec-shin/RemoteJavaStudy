package myobj.c07;

public class Network extends School{
	
	int linux[];
	int network[];
	int ccna[];	
	
	Network(int studentCount){
		classNum = 2000;
		this.studentCount = studentCount;
		studentNum = new int[studentCount];
		totalScore = new int[studentCount];
		avaScore = new Double[studentCount];
		name = new String[studentCount];
		korean = new int[studentCount];
		english = new int[studentCount];
		linux = new int[studentCount];
		network = new int[studentCount];
		ccna = new int[studentCount];	
	}
	
	@Override
	void randomMakeScore() {		
		for(int i=0; i<studentCount; i++) {
			studentNum[i] = ++classNum;
			name[i] = randomMakeName();
			korean[i] = (int)(Math.random() * 101 +1);
			english[i] = (int)(Math.random() * 101 +1);
			linux[i] = (int)(Math.random() * 101 +1);
			network[i] = (int)(Math.random() * 101 +1);
			ccna[i] = (int)(Math.random() * 101 +1);
		}
	}

	@Override
	void printGrade() {
		System.out.println("####Network�� �л����� ����####");
		for(int i=0; i<studentCount; i++) {
			totalScore[i] = (korean[i]+english[i]+linux[i]+network[i]+ccna[i]);
			avaScore[i] = totalScore[i]/6.0;
			System.out.printf("%s�л��� ������ %d�̰� ����� %.2f�Դϴ�. \n",name[i],totalScore[i],avaScore[i]);
		}
		System.out.println();
	}
}

















