package myobj.c07;

abstract public class School {
	
	int classNum;
	int studentCount;
	int totalScore[];
	Double[] avaScore;	
	int studentNum[];
	String name[];
	
	String firstName[] = {"��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
	String middleName[] = {"��","��","ȣ","��","��","��","��","��","��","��","��","��","��","��"};
	String lastName[] = {"��","��","ȣ","��","��","��","��","��","��","��","��","��","��","��"};
	
	int korean[];
	int english[];
	
	String randomMakeName() {		
		int first = (int)(Math.random() * firstName.length + 0);
		int middle = (int)(Math.random() * middleName.length + 0);
		int last = (int)(Math.random() * lastName.length + 0);
		
		return firstName[first] + middleName[middle] + lastName[last];
	}
	
	abstract void randomMakeScore();
	
	abstract void printGrade();
}
