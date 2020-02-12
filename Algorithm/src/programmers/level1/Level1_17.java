package programmers.level1;

// �ڵ��� ��ȣ ������
public class Level1_17 {
	public String solution(String phone_number) {
		String answer = "";
		//���ڿ� �ڸ���, �迭 ����
		String[] temp = phone_number.split("");
		
		//���ڿ� �迭 �� 4�ڸ� ����  "*"����
		for(int i = 0; i < temp.length-4; i++) {
			temp[i] = "*";
		}
		//answer�� ���ڹ迭 ����
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Level1_17 test = new Level1_17();
		
		//�׽��� ��¹�
		String phone_number = "123456789";
		
		System.out.println(test.solution(phone_number));
	}
}
