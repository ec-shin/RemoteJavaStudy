package myinterface;

public class Rifle implements Gun {
	static int magazine=0;
	static int brokenCount=1;
	final int MAX_MAGAZINE=5;

	@Override
	public int shot() {
		magazine--;
		return magazine;
	}

	@Override
	public int load() {
		magazine++;
		return magazine;
	}
	
	public void fullLoad() {
		for(int i=magazine;i<MAX_MAGAZINE;i++) {
			magazine++;
		}
		
		System.out.printf("%d���� �ѹ��� �����߽��ϴ�.\n",MAX_MAGAZINE);
	}

	@Override
	public boolean broken() {
		if(brokenCount==0) {
			return true;
		}else {
			brokenCount--;
			System.out.println("���� ������: "+brokenCount);
			return false;		
		}

	}

	
}
