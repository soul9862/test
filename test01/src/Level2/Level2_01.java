package Level2;

public class Level2_01 {
	public boolean isHarshad(int num){

		String test = "";
		test = String.valueOf(num);
		int temp = 0;
		
		for(int i = 0; i < test.length(); i++) {
			temp += Integer.parseInt(test.substring(i, i+1));
		}
		if(num % temp == 0) {
			return true;
		}else {
			return false;	
		}
		
	}
  
       // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		Level2_01 sn = new Level2_01();
		System.out.println(sn.isHarshad(11));
	}
}
