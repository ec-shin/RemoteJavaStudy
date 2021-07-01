package answer;

public class D07_CheckValidPhoneNumber{

public static boolean checkNumeric(char[] phoneNumber) {
      for(int i = 0; i < phoneNumber.length; ++i) {
         if((i == 3 || i == 8) && phoneNumber[i] == '-') {
            continue;
         }else if((i!=3 && i!=8) &&Character.isDigit(phoneNumber[i])) {
            continue;
         }else {
            return false;
         }
      }
      return true;
   }
   
   public static void checkValidPhoneNumber(char[] phoneNumber) {
      boolean valid = true;
      
      String front = "" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2];
      
      if(!front.equals("010")) {
         valid = false;
         System.out.println("[WARNING] �� ���� ���ڰ� ������ ���� �����Դϴ�.");
      }else if(phoneNumber.length != 13) {
         valid = false;
         System.out.println("[WARNING] �ڵ��� ��ȣ�� ���̰� �ƴմϴ�.");
      }else if(!checkNumeric(phoneNumber)) {
         valid = false;
         System.out.println("[WARNING] ���� �ƴ� ���ڰ� ���ԵǾ��ų� -�� ��ġ�� �̻���");
      }
      
      
      System.out.println(new String(phoneNumber) + "�� " + (valid ? "�ùٸ� �ڵ��� ��ȣ�Դϴ�." : "�ùٸ��� ���� �ڵ��� ��ȣ�Դϴ�."));
   }
}
      