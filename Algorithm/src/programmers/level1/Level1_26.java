package Algorithm.src.programmers.level1;
// ���� ��ȣ
public class Level1_26 {
	public String solution(String s, int n) {
		String answer = "";
		char[] temp = s.toCharArray();

		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == ' ') {
				temp[i] = ' ';
			}else if(temp[i] >= 97) {
				temp[i] = (char) (temp[i] + n);
				if(temp[i] > 122) {
					temp[i] = (char) (temp[i] - 26);
				}
			}else if(temp[i] >= 65) {
				temp[i] = (char) (temp[i] + n);
				if(temp[i] > 90) {
					temp[i] = (char) (temp[i] - 26);
				}
			}
			
			answer += temp[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Level1_26 test = new Level1_26();

		String s = "a B z";
		int n = 4;
		System.out.println(test.solution(s, n));
	}
}
