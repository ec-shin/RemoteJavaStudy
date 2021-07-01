package quiz.d_;

public class D07_Info implements Comparable<D07_Info> {
	String name;
	int age;
	String gender;
	static String sort = "�̸�";
	static String sortWay = "������";
	
	D07_Info(){
		
	}
	
	D07_Info(String name, int age, String gender){
		this.name= name;
		this.age = age;
		this.gender= gender;
	}
	
	public String toString() {
		return String.format(" �̸�:%s ����:%d ����:%s",this.name,this.age,this.gender);
	}

	@Override
	public int compareTo(D07_Info o) {
		if(sort.equals("����")&&sortWay.equals("������")) {
			return Integer.compare(age, o.age) !=0?
				Integer.compare(age, o.age) : this.name.compareTo(o.name);
		}else if(sort.equals("����")&&sortWay.equals("������")) {
			return Integer.compare(o.age, age) !=0?
					Integer.compare(o.age, age) : this.name.compareTo(o.name);
		}else if(sort.equals("�̸�")&&sortWay.equals("������")) {
			return this.name.compareTo(o.name) !=0?
					this.name.compareTo(o.name) : Integer.compare(age, o.age);
		}else if(sort.equals("�̸�")&&sortWay.equals("������")) {
			return o.name.compareTo(this.name) !=0?
					o.name.compareTo(this.name) : Integer.compare(age, o.age);
		}else if(sort.equals("����")&&sortWay.equals("������")){
			return this.gender.compareTo(o.gender) !=0?
					this.gender.compareTo(o.gender) : Integer.compare(age, o.age);
		}else {
			return o.gender.compareTo(this.gender) !=0?
					o.gender.compareTo(this.gender) : Integer.compare(age, o.age);
		}
	}
}
