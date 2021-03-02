package Algorithm.src.programmers.level1;
// ���￡�� �輭�� ã��
public class Level1_09 {

	public String findKim(String[] seoul){
		//x�� �輭���� ��ġ�� �����ϼ���.
		String answer = "";
		int index = 0;

		for(int i = 0; i < seoul.length; i++) {
			answer = seoul[i];
			if(answer.equals("Kim")) {
				index = i;
			}
		}
		answer = "�輭���� "+ index + "�� �ִ�";
		
		return answer;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		Level1_09 kim = new Level1_09();
		String[] names = {"Jane", "Kim"};
		System.out.println(kim.findKim(names));
	}
}
