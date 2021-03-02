package Algorithm.src.programmers.level1;
public class Level1_12 {
	public String reverseStr(String str){
		
		int n = str.length();
		
		String[] convert = new String[n];
		int[] test = new int[n];
		int temp = 0;
		String answer = "";
				
		for(int i = 0; i < str.length(); i++) {
			convert[i] = str.substring(i, i+1);
			test[i] = convert[i].charAt(0);
		}
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++) {
				if(test[i] < test[j]) {
					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			answer += Character.toString((char) test[i]);
		}
		return answer;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Level1_12 rs = new Level1_12();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}
