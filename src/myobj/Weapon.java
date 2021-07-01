package myobj;

public class Weapon {
	int attackPower;
	int nowReinLevel;
	double reinProbability[];
	int attackPowerIncrease[];
	
	Weapon(int nowReinLevel){
		reinProbability = new double[] {0,100,100,90,60,45,30,30,30,15,15,15,10,10,10,5,5,3,3,2,2,1,1};
		attackPowerIncrease = new int[] {5000,100,130,140,150,160,170,180,190,200,210,240,270,320,360,430,1000,1200,1400,1600,1750,1900,2200};
		
		this.nowReinLevel = nowReinLevel;
		for(int i=0; i<nowReinLevel;i++) {
			attackPower += attackPowerIncrease[i];
		}
	}
	
	void reinforce() {
		
		if(nowReinLevel==reinProbability.length) {
			System.out.println("���̻� ��ȭ�� �ܰ谡 �����ϴ�.");
		}else {
			int pro = (int)(Math.random() * 100 + 1);
			if(pro <= reinProbability[nowReinLevel]) {
				System.out.println("��ȭ�� �����ϼ̽��ϴ�!!");
				attackPower+=attackPowerIncrease[nowReinLevel];
				nowReinLevel++;
				System.out.printf("���� ���� %d -> ���� ���� %d \n",nowReinLevel-1,nowReinLevel);
				System.out.printf("���� ���ݷ� %d -> ���� ���ݷ� %d \n",attackPower-attackPowerIncrease[nowReinLevel],attackPower);
			}else {
				System.out.println("��ȭ�� �����ؼ̽��ϴ�.");
			}
		}
	}
	
	void attackPowerCheck() {
		System.out.printf("���緹���� %d ���� ���ݷ��� %d �Դϴ�\n",nowReinLevel,attackPower);
	}
}



