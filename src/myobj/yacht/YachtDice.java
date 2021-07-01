package myobj.yacht;

import java.util.Arrays;
import java.util.Random;

public class YachtDice {

        final static int MAX_DICE_NUM = 6;
        final static int DICE_SIZE = 5;
        
        int[] dices;
        int[] counts;
        
        Random ran;
        
        public YachtDice() {
                ran = new Random();
                dices = new int[DICE_SIZE];
                counts = new int[MAX_DICE_NUM];
                
                // Arrays.fill() : �迭�� ���ϴ� ���ڷ� �ʱ�ȭ ���ִ� �޼���
                // �� Arrays Ŭ�������� �迭�� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� (JAVA API ����) 
                Arrays.fill(dices, 1);                
        }        
        
        public void roll() {
                for (int i = 0; i < DICE_SIZE; ++i) {
                        dices[i] = ran.nextInt(6) + 1;
                }
        }
        
        public void printDice() {
                System.out.println(Arrays.toString(dices));
        }
        
        private String available() {
                String result = "";
                
                return result;
        }
        
        boolean checkNo1() {
                boolean check2 = false;
                boolean check3 = false;
                
                for (int count : counts) {
                        if (count == 2) {
                                check2 = true;
                        } else if (count == 3) {
                                check3 = true;
                        }
                }
                return check2 && check3;
        }
        
        public void countDices() {
                for (int i = 0; i < MAX_DICE_NUM; i++) {
                        counts[i] = 0;
                }
                
                for (int i = 0; i < DICE_SIZE; i++) {
                        counts[dices[i] - 1]++;
                }
        }
        
        // ���� ��Ʈ����Ʈ Ȯ���ϱ�.
        boolean checkNo2() {
                boolean check = false;
                
                if (counts[2] >= 1 && counts[3] >= 1) {
                        if (counts[0] >= 1 && counts[1] >= 1 || counts[1] >= 1 && counts[4] >= 1 || counts[4] >= 1 && counts[5] >= 1) {
                                check = true;
                        }
                }
                return check;
        }
        
        // ���� ��Ʈ����Ʈ Ȯ���ϱ�.
        boolean checkNo3() {
                boolean check = false;
                
                if (counts[1] >= 1 && counts[2] >= 1 && counts[3] >= 1 && counts[4] >= 1) {
                        if (counts[0] >= 1 || counts[5] >= 1) {
                                check = true;
                        }
                }
                return check;
        }
        
        // 4 ���̽� Ȯ���ϱ�.
        boolean checkNo4() {
                boolean check = false;
                for (int count : counts) {
                        if (count >= 4) {
                                check = true;
                        }
                }
                return check;
        }
        
        // 5 ���̽� Ȯ���ϱ�.
        boolean checkNo5() {
                boolean check = false;
                for (int count : counts) {
                        if (count == 5) {
                                check = true;
                        }
                }
                return check;
        } 
}











