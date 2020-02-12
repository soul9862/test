package programmers.level1;

class GetMinMaxString {
	public String getMinMaxString(String str) {
		String[] strA = str.split(" ");
		int[] test = new int[strA.length];
		
		for(int i = 0; i < strA.length; i++) {
			test[i] = Integer.parseInt(strA[i]);
		}
		
		int max = test[0];
		int min = test[0];
		
		for(int i = 0; i < test.length; i++) {
			if(test[i] > max) {
				max = test[i];
			}
			if(test[i] < min) {
				min = test[i];
			}
		}
		
		
		return ""+min+" "+max;
	}
}
public class Level1_06 {
	public static void main(String[] args) {

		String str = "-1 -2 -3 -4";
		GetMinMaxString minMax = new GetMinMaxString();
		//�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
		
	}
}
