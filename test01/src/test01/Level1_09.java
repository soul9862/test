package test01;

public class Level1_09 {

	public String findKim(String[] seoul){
		//x�� �輭���� ��ġ�� �����ϼ���.
		int x = 0;

		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i] == "Kim") {
				x=i;
			}
		}
		
		return "�輭���� "+ x + "�� �ִ�";
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void main(String[] args) {
		Level1_09 kim = new Level1_09();
		String[] names = {"Queen", "Tod","Kim"};
		System.out.println(kim.findKim(names));
	}
}
